import java.util.HashMap;

public class MinimumSwap2 {

	public static void main(String[] args) {

		int[] arr = { 5, 1, 2, 4, 3 };

		System.out.println(minSwap3(arr));

	}

	// method 1: Brute Force Algorithm
	// Time complexity: O(n^2): no one will accept this answer.

	private static int minSwap(int[] arr) {

		int swapCount = 0;

		for (int i = 0; i < arr.length; i++) {

			int min = Integer.MAX_VALUE;

			for (int j = 0; j < arr.length; j++) {

				if (arr[i] > arr[j] && i != j) {

					arr[i] = arr[j];

					swapCount++;
				}

			}
		}

		return swapCount;
	}

	// method 2: Using HashMap & cycle method,comparing index & index-value, if not
	// equal, taking
	// Index-value as next index to find cycle.If returned at start position, cycle
	// detected.
	//reference: https://www.youtube.com/watch?v=J9ikRMK8Yhs

	private static int minSwap2(int[] arr) {

		int n = arr.length;
		boolean[] visited = new boolean[n + 1];

		HashMap<Integer, Integer> hs = new HashMap<>();

		int swapCount = 0;
		// putting all values in hashmap.
		for (int i = 1; i < visited.length; i++) {

			hs.put(i, arr[i - 1]);
		}

		for (int k = 1; k < hs.size(); k++) {

			if (visited[k] == false) {

				visited[k] = true;

				if (k == hs.get(k)) {

					continue;
				} else {

					int c = hs.get(k);

					while (!visited[c]) {

						visited[c] = true;

						int nextElement = hs.get(c);

						c = nextElement;

						++swapCount;
					}
				}
			}
		}

		return swapCount;

	}

	// method 3:Using cycle: Cycle size = no. of nodes, swap count = cycle size-1;
// reference: https://www.includehelp.com/java-programs/minimum-swaps-required-to-sort-an-array.aspx
	private static int minSwap3(int[] arr) {

		int n = arr.length;

		boolean[] visited = new boolean[n];

		int swapCount = 0;

		for (int i = 0; i < n; i++) {

			int j = i, cycle = 0;
// checking if index is not visited.
			while (!visited[j]) {

				visited[j] = true;
// here we are assigning  value of array[index] as next index, to find cycle
				j = arr[j] - 1; // -1 because array index start from 0.

				cycle++;
			}

			if (cycle != 0) {

				swapCount += cycle - 1;
			}

		}

		return swapCount;

	}

}
