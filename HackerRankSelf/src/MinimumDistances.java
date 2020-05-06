import java.util.HashMap;
import java.util.Map;

public class MinimumDistances {

	public static void main(String[] args) {

		int[] arr = { 7, 1, 2, 3, 1, 7 };

		System.out.println(minimumDistance2(arr));

	}

// Method1: Brute force O(n^2)
	private static int minimumDistance(int[] arr) {

		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {

					min = Math.min(min, (j-i));
				}

			}
		}

		return (min == Integer.MIN_VALUE ? -1 : min);

	}

	// Method2: Using HashMap O(n)
	private static int minimumDistance2(int[] arr) {

		Map<Integer, Integer> map = new HashMap<>();

		int min = Integer.MAX_VALUE;

		int currentIndex = 0;
		int previousIndex = 0;

		for (int i = 0; i < arr.length; i++) {

			if (map.containsKey(arr[i])) {

				currentIndex = i;
				previousIndex = map.get(arr[i]);

				min = Math.min(min, (currentIndex - previousIndex));

			} else {

				map.put(arr[i], i);
			}

		}

		return (min == Integer.MIN_VALUE ? -1 : min);
	}

}
