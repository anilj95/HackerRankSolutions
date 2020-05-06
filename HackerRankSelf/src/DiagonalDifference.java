
public class DiagonalDifference {

	public static void main(String[] args) {
		
		//3*3 matrix
		int mat[][] = { { 1, 2, 3}, { 5, 6, 7}, { 9, 10, 0} };
		
		int dmax = diagonalDifference(mat);
		
		System.out.println(dmax);

	}

	public static int diagonalDifference(int[][] arr) {
		// Write your code here

		int max_diagonal = 0;
		int rows = arr.length;
		int column = arr[0].length;

		for (int i = 0; i < rows-2; i++) {

			for (int j = 0; j < column-2; j++) {

				int d1 = arr[i][j] + arr[i + 1][j + 1] + arr[i + 2][j + 2];
				int d2 = arr[i][j + 2] + arr[i + 1][j + 1] + arr[i + 2][j];

				max_diagonal = Math.abs(d1-d2);
			}
		}

		return max_diagonal;

	}

}
