package searching;

import java.util.*;

public class Floor_of_an_element {
	private static int Search(int[] a, int start, int end, int res, int x) {

		if (start > end)
			return res;
		int mid = start + (end - start) / 2;
		if (a[mid] == x)
			return mid;
		if (a[mid] < x) {
			res = a[mid];
			return Search(a, mid + 1, end, res, x);
		}
		return Search(a, start, mid - 1, res, x);
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int x = in.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = in.nextInt();
			int index = Search(a, 0, n - 1, -1, x);
			System.out.println(index);
		}
		in.close();
	}
}
