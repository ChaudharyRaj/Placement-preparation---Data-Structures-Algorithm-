package searching;

import java.util.*;

public class Nearly_Sorted_Array {

	private static int find(int a[], int n, int key) {
		int start = 0;
		int end = n;
		while (start <= end) {

			int mid = start + (end - start) / 2;

			if (a[mid] == key) {
				return mid;
			} else if (mid > start && a[mid - 1] == key) {
				return mid - 1;
			} else if (mid < end && a[mid + 1] == key) {
				return mid + 1;
			}
			if (a[mid] > key)
				end = mid - 2;
			else
				start = mid + 2;
		}
		return -1;
	}// 10 3 40 20 50 80 70

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.nextInt();
			}
			int key = in.nextInt();
			int index = find(a, n - 1, key);
			System.out.println(index);
		}
	}

}
