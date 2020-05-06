
public class TwoDArray {

	public static void main(String[] args) {

	}

	// reference: Nick_white
	static int maxHourGlassSum(int[][] arr) {

		int max_hourglass_sum = Integer.MIN_VALUE;
		

		int rows = arr.length;
		int column = arr[0].length;

		for (int i = 0; i < rows - 2; i++) {

			int current_hourglass_sum = 0;

			for (int j = 0; j < column - 2; j++) {

				current_hourglass_sum = arr[i][j] + arr[i][j + 1] + arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j]
						+ arr[i + 2][j + 1] + arr[i + 2][j + 2];

				max_hourglass_sum = Math.max(current_hourglass_sum, max_hourglass_sum);

			}

		}

		return max_hourglass_sum;

	}

}
