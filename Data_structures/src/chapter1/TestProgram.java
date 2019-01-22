package chapter1;

import java.util.Comparator;


class CaseInsensitiveCompare implements Comparator<String>{
	public int compare(String lhs,String rhs) {
		return lhs.compareToIgnoreCase(rhs);
	}
}

public class TestProgram {
	public static <AnyType> AnyType findMax(AnyType [] arr,Comparator<? super AnyType> cmp) {
		int maxIndex=0;
		for(int i=1;i<arr.length;i++)
			if(cmp.compare(arr[i],arr[maxIndex])>0)
				maxIndex=i;
		return arr[maxIndex];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr = {"ZEBRA","alligator","crocdile"};
		System.out.println(findMax(arr,new CaseInsensitiveCompare()));
	}

}
