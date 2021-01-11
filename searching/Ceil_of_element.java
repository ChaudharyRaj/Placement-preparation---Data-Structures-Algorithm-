package searching;

import java.util.*;

public class Ceil_of_element {
	private static int findceil(int[] a, int n, int x) {

		int start = 0;
		int end = n - 1;
		int res = -1;
		while (start <= end) {

			int mid = start + (end - start) / 2;
			if (a[mid] == x)
				return a[mid];
			if (a[mid] > x) {
				res = a[mid];
				end = mid - 1;
			} else
				start = mid + 1;
		}
		return res;
		// 1 2 8 10 10 12 19
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = in.nextInt();
			int key = in.nextInt();
			int ceil = findceil(a, n, key);
			System.out.println(ceil);
		}
	}

}
