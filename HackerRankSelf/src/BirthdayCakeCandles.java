
public class BirthdayCakeCandles {

	public static void main(String[] args) {

		int[] arr = { 1, 3, 4, 2, 4, 4 };

		System.out.print(findMaxAndFreqency(arr));

	}

	private static int findMaxAndFreqency(int[] arr) {

		int frequency = 0;
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == max) {

				frequency++;
			}
			if (arr[i] > max) {

				max = arr[i];

				frequency = 1;
			}

		}

		return frequency;

	}

}
