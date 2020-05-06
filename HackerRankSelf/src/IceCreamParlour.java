import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IceCreamParlour {

	public static void main(String[] args) {

         int[] arr = {1,2,3,4,5};
         
         int value = 8;
         
         int[] result = twoSumA1(arr,value);
         
         System.out.println(result[1]+" "+ result[0]);

	}

//Method 1: Using HashMap
	private static int[] twoSumA1(int[] arr, int value) {

		int[] result = new int[2];

		Map<Integer, Integer> hs = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {

			int x = arr[i];

			int y = value - x;

			Integer j = hs.get(y);

			if (j != null) {

				result[0] = i + 1;
				result[1] = j + 1;

			}

			hs.put(x, i);
		}

		return result;
	}

	// Method 2: Using Array
	private static int[] twoSumA2(int[] arr, int value) {

		int[] result = new int[2];
// given constraints Array size : 10^4
		int[] frequency = new int[10001];

		Arrays.fill(frequency, -1);

		for (int i = 0; i < arr.length; i++) {

			int x = arr[i];

			int y = value - x;

			if (y >= 0) {

				int j = frequency[y];

				if (j != -1) {

					result[0] = i + 1;
					result[1] = j + 1;

				}
			}

			frequency[x] = i;
		}

		return result;
	}

}
