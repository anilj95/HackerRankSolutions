
public class ClimbingLeaderBoard {

	public static void main(String[] args) {

		int[] score = { 100, 100, 50, 40, 40, 20, 10 };

		int[] alice = { 5, 25, 50, 120 };
		int[] result = new int[alice.length];

		result = leadershipRank(score, alice);

		for (int i = 0; i < result.length; i++) {

			System.out.println(result[i] + " ");

		}

	}

	private static int[] leadershipRank(int[] scores, int alice[]) {
		int n = scores.length;
		int m = alice.length;
		int[] result = new int[m];
		int[] rank = new int[n];

		rank[0] = 1;
// 1st for loop is used to fill rank array according to score array.		
		for (int i = 1; i < n; i++) {

			if (scores[i] == scores[i - 1]) {

				rank[i] = rank[i - 1];
			} else {

				rank[i] = rank[i - 1] + 1;
			}
		}

// 2nd for loop is to compare Alice's score with score array & fill result array by deciding rank
		// by comparing with rank array

		for (int i = 0; i < m; i++) {

			int aliceScore = alice[i];
// boundary condition for upper level			
			if (aliceScore > scores[0]) {

				result[i] = 1;
				// boundary condition for lower level
			} else if (aliceScore < scores[n - 1]) {

				result[i] = rank[n - 1] + 1;
			} else {
				int index = binarySearch(scores, aliceScore);
				result[i] = rank[index];
			}
		}

		return result;

	}

	private static int binarySearch(int[] arr, int key) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (arr[mid] == key) {
				return mid;
			} else if (arr[mid] < key && key < arr[mid - 1]) {

				return mid;
			} else if (arr[mid] > key && key >= arr[mid + 1]) {

				return mid + 1;
			} else if (arr[mid] < key) {

				high = mid - 1;
			} else if (arr[mid] > key) {

				low = mid + 1;
			}
		}

		return -1;
	}

}
