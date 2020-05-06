import java.util.Arrays;
import java.util.Collections;

public class ArrayDS {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4 };

		int[] reverse = reverseArray3(arr);

		for (int i = 0; i < reverse.length; i++) {

			System.out.print(reverse[i]);
		}

		// reverseArray3(arr);

	}

//Method 1: Using extra array
	private static int[] reverseArray(int[] arr) {

		int n = arr.length;

		int[] reverse = new int[n];

		int j = n;

		for (int i = 0; i < n; i++) {

			reverse[j - i - 1] = arr[i];
		}

		return reverse;

	}

// method :2 Using for loop
	private static void reverseArray2(int[] arr) {

		int n = arr.length;

		int temp = 0;

		for (int i = 0; i < n / 2; i++) {

			temp = arr[i];

			arr[i] = arr[n - 1 - i];

			arr[n - i - 1] = temp;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);

		}

	}

	// method :3 Using while loop
	private static int[] reverseArray3(int[] arr) {

		int n = arr.length;

		int temp = 0;

		int start = 0;
		int end = n - 1;

		while (start <= end) {

			temp = arr[start];

			arr[start] = arr[end];

			arr[end] = temp;

			start++;
			end--;
		}

		return arr;

//		for (int i = 0; i < arr.length; i++) {
		// System.out.print(arr[i]);

//		}

	}

	// method :4 Using java function

	private static Integer[] reverseArray4(Integer[] arr) {

		Collections.reverse(Arrays.asList(arr));

		return arr;

	}

}
