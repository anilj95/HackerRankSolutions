
public class ArrayLeftRotation {
// reference : Nick_white
	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4, 5 };

		int[] rotated_array = leftRotation(arr, 4);

		printArray(rotated_array);

	}

	// reference : Nick_white
	static int[] leftRotation(int[] arr, int d) {
		// 'd' is the no. of rotations to perform.
		int size = arr.length;

		int[] rotated_arr = new int[size];

		int i = 0;
		int rotated_index = d;

		while (rotated_index < size) {

			rotated_arr[i] = arr[rotated_index];
			i++;
			rotated_index++;

		}

		rotated_index = 0;

		while (rotated_index < d) {

			rotated_arr[i] = arr[rotated_index];
			i++;
			rotated_index++;
		}

		return rotated_arr;

	}

	// reference : Javaaid
	// here we are using right rotation RR= arraySize - no. of left Rotation
	static int[] leftRotation2(int[] arr, int d) {

		int n = arr.length;

		int[] rotateArray = new int[n];

		for (int i = 0; i < n; i++) {// treat i as old index.

			int newIndex = (i + (n - d)) % n;// '%' modulo operator is just to check if new index is within array size.

			rotateArray[newIndex] = arr[i];
		}

		return rotateArray;

	}

	static void printArray(int[] arr) {

		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] + " ");
		}
	}

}
