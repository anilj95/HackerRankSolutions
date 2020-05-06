import java.util.HashMap;
import java.util.Map;

public class SparseArray {

	public static void main(String[] args) {

		String[] str = { "ab", "abc", "bc", "ab" };
		String[] query = { "ab", "bc", "abcd", "abc" };

		int[] result = findOccurance(str, query);

		for (int i = 0; i < result.length; i++) {

			System.out.println(result[i] + " ");

		}

	}

	private static int[] findOccurance(String[] str, String[] query) {

		Map<String, Integer> hs = new HashMap<>();

		int[] result = new int[query.length];

		for (int i = 0; i < str.length; i++) {

			if (hs.containsKey(str[i])) {

				hs.put(str[i], hs.get(str[i]) + 1);
			} else {

				hs.put(str[i], 1);
			}
		}

		for (int j = 0; j < query.length; j++) {

			if (hs.containsKey(query[j])) {

				result[j] = hs.get(query[j]);
			}
		}

		return result;

	}

}
