import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TripletsSum {

	// Problem Statement:3 arrays are given(a,b,c) and some condition p belongs to
	// a,q belongs to b,r belongs to c
	// Also p<= q && q >=r. How many 'distinct' triplet can be formed.

	static long triplates() {

		int a[] = { 1, 3, 5, 7, 7, 1 };
		int b[] = { 7, 5, 9 };
		int c[] = { 7, 9, 11, 11, 13 };

		int tripletCount = 0;

		int[] freshA = removeDuplicate(a);
		int[] freshB = removeDuplicate(b);
		int[] freshC = removeDuplicate(c);

		Arrays.sort(freshA);
		Arrays.sort(freshB);
		Arrays.sort(freshC);

		for (int key : freshB) {

			int c1 = getIndexCount(freshA, key) + 1;

			int c3 = getIndexCount(freshC, key) + 1;

			tripletCount += c1 * c3;
		}

		return tripletCount;

	}

	static int[] removeDuplicate(int arr[]) {

		int leng = arr.length;

		int result[] = new int[leng];

		Set<Integer> set = new HashSet<>(leng);

		for (int i : arr) {

			set.add(i);
		}

		int j = 0;

		for (int item : set) {

			result[j++] = item;
		}
		return result;
	}

	static int getIndexCount(int arr[], int value) {
		int low = 0;
		int count = -1;
		int high = arr.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (arr[mid] <= value) {

				count = mid;

				low = mid + 1;
			} else {

				high = mid - 1;
			}
		}

		return count;

	}

	public static void main(String[] args) {

		long count = triplates();

		System.out.println(count);

	}

}
