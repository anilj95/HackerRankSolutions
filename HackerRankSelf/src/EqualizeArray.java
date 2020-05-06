
public class EqualizeArray {
// minimum deletion required to make make array of equal elements: Observation: array length - maxFrequency
	public static void main(String[] args) {

      int[] arr = {1,2,2,3,3,3};
      
      System.out.println(minDeletion(arr));
		

	}

	private static int minDeletion(int[] arr) {

		int n = arr.length;
		int result = 0;

		int[] aux = new int[101]; // array size can be 101 as constraint is given.

		for (int i = 0; i < n; i++) {

			int index = arr[i]; // treating every no. as index of aux array & incrementing them.

			aux[index]++; 
		}

		int maxFrequency = getMaxFrequency(aux);

		result = n - maxFrequency;

		return result;

	}

	private static int getMaxFrequency(int[] arr) {
		int maxFrequency = Integer.MIN_VALUE;

		for (int frequency : arr) {

			if (frequency > maxFrequency) {

				maxFrequency = frequency;
			}
		}

		return maxFrequency;
	}
}
