package chapter2;

public class max_contiguous_subseq_sum {
	// version 1:Cubic
	public static int maxSum(int[] a) {
		int maxSum = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i; j < a.length; j++) {
				int thisSum = 0;
				for (int k = i; k <= j; k++) {
					thisSum += a[k];
				}
				if (thisSum > maxSum)
					maxSum = thisSum;
			}
		}
		return maxSum;
	}

	// version 2:Quadratic
	public static int maxSum2(int[] a) {
		int maxSum = 0;
		for (int i = 0; i < a.length; i++) {
			int thisSum=0;
			for (int j = i; j < a.length; j++) {
				if (thisSum>maxSum)
					maxSum=thisSum;
			}
		}
		return maxSum; 
	}
	
	//version 3:Recursive & divide-and-conquer
	public static int maxSumRec(int [] a,int left,int right) {
		if(left==right)
			if(a[left]>0)
				return a[left];
			else
				return 0;
		int center=(left+right)/2;
		int maxLeftSum=maxSumRec(a,left,center);
		int maxRightSum=maxSumRec(a,center+1,right);
		
		int maxLeftBorderSum=0,leftBorderSum=0;
		for(int i=center;i>=left;i--) {
			leftBorderSum+=a[i];
			if(leftBorderSum>maxLeftBorderSum)
				maxLeftBorderSum=leftBorderSum;
		}
		
		int maxRightBorderSum=0, rightBorderSum=0;
		for(int i=center+1;i<=right;i++) {
			rightBorderSum+=a[i];
			if(rightBorderSum>maxRightBorderSum)
				maxRightBorderSum=rightBorderSum;
		}
		
		return max3(maxLeftSum,maxRightSum,maxLeftBorderSum+maxRightBorderSum);
	}
	
	public static int max3(int maxLeftSum,int maxRightSum,int BorderSum) {
		if(maxLeftSum > maxRightSum)
			if(maxLeftSum>BorderSum)
				return maxLeftSum;
			else
				return BorderSum;
		else if (maxRightSum > BorderSum)
				return maxRightSum;
			else 
				return BorderSum;
	}
	
	public static int maxSubSum3(int [] a) {
		return maxSumRec(a,0,a.length-1); 
	}
	
	//version 4:Linear-time
	public static int maxSubSum4(int [] a) {
		int maxSum=0,thisSum=0;
		for(int i=0;i<a.length;i++) {
			thisSum+=a[i];
			if(thisSum > maxSum)
				maxSum=thisSum;
			else if(thisSum<0)// nice
				thisSum=0;
		}
		return maxSum;
	}
}
