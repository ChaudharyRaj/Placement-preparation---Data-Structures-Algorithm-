package searching;

import java.util.*;

public class Next_Alphabetical {
	private static char findNextAlphabet(char[] a, int start, int end, char key, char next) {
		if (start > end)
			return next;
		int mid = start + (end - start) / 2;
		if (a[mid] == key)
			return findNextAlphabet(a, mid + 1, end, key, next);
		else if (a[mid] > next) {
			next = a[mid];
			return findNextAlphabet(a, start, mid - 1, key, next);
		}
		return findNextAlphabet(a, mid + 1, end, key, next);
	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {
			int n = in.nextInt();
			char[] a = new char[n];
			for (int i = 0; i < n; i++) {
				a[i] = in.next().charAt(0);
			}
			char key = in.next().charAt(0);
			char next = findNextAlphabet(a, 0, n - 1, key, '#');
			System.out.println(next);
		}
	}
}
