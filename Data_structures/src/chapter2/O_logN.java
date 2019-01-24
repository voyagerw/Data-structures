package chapter2;

//常见 的复杂度为O(NlogN)的算法
public class O_logN {
	// 折半查找：binary search
	public static <T extends Comparable<? super T>> int binarySearch(T[] a, T x) {
		// a已排序
		int low = 0, high = a.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (a[mid].compareTo(x) < 0)
				low = mid + 1;
			else if (a[mid].compareTo(x) > 0)
				high = mid - 1;
			else
				return mid;
		}

		return -1;
	}

	// 欧几里得算法（最大公约数）
	// gcd:greatest common divisor
	public static long gcd(long m, long n) {
//		long t;
//		if (m < n) {
//			t = m;
//			m = n;
//			n = t;
//		}
//下面的循环，当m < n时，第一次循环迭代会将他们互相交换。因此上面的判断无必要
		while (n != 0) {
			long rem = m % n;
			m = n;
			n = rem;
		}
		return m;
	}

	// 高效率幂运算
	public static long pow(long x, int n) {
		if (n == 0)
			return 1;
		if (n == 1) // 非必需的判断，下面的基数return可包含
			return x;
		if (isEvent(n))
			return pow(x * x, n / 2);
		else
			return pow(x * x, n / 2) * x;
	}
}
