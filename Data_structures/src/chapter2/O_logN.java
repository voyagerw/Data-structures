package chapter2;

//���� �ĸ��Ӷ�ΪO(NlogN)���㷨
public class O_logN {
	// �۰���ң�binary search
	public static <T extends Comparable<? super T>> int binarySearch(T[] a, T x) {
		// a������
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

	// ŷ������㷨�����Լ����
	// gcd:greatest common divisor
	public static long gcd(long m, long n) {
//		long t;
//		if (m < n) {
//			t = m;
//			m = n;
//			n = t;
//		}
//�����ѭ������m < nʱ����һ��ѭ�������Ὣ���ǻ��ཻ�������������ж��ޱ�Ҫ
		while (n != 0) {
			long rem = m % n;
			m = n;
			n = rem;
		}
		return m;
	}

	// ��Ч��������
	public static long pow(long x, int n) {
		if (n == 0)
			return 1;
		if (n == 1) // �Ǳ�����жϣ�����Ļ���return�ɰ���
			return x;
		if (isEvent(n))
			return pow(x * x, n / 2);
		else
			return pow(x * x, n / 2) * x;
	}
}
