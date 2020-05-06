
public class NewYearChaos {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };

		minimumBribes(arr);

	}

	private static void minimumBribes(int[] arr) {

		int swapCount = 0;
		for (int i = arr.length - 1; i >= 0; i--) {// starting from last because movement is from right to left.

			if (arr[i] != i + 1) {// filter case: if bribe happened, then only proceed.

				if ((i - 1 >= 0) && arr[i - 1] == i + 1) {// case1: if bribed for 1 position.

					swapCount++;

					swap(arr, i - 1, i);
				} else if ((i - 2 >= 0) && arr[i - 2] == i + 1) {// case1: if bribed for 2 position.

					swapCount += 2;
					swap(arr, i - 2, i - 1);
					swap(arr, i - 1, i);

				} else {// case3: if bribed for more than 2 positions.

					System.out.println("Too chaotic");
					return;
				}

			}

		}

		System.out.println(swapCount);

	}

	private static void swap(int[] arr, int a, int b) {

		int temp = arr[a];
		arr[a] = arr[b];

		arr[b] = temp;

	}

}
