
public class MiniMaxSum {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 5, 7, 9 };

		minMax(arr);

	}

	// Method:1 Using one for loop

	private static void minMax(int[] arr) {

		long min, max, sum;

		min = max = sum = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < min) {

				min = arr[i];
			}

			if (arr[i] > max) {

				max = arr[i];
			}

			sum += arr[i];

		}

		// min = sum-max; & max = sum-min; for given array


		System.out.print((sum - max) + " " +(sum - min));

	}

}
