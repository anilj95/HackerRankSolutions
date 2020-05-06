
public class LongestCommonSubSequence {

	// Given two strings, we have to find sub sequence(abc, not acb) which is common
	// in both.
	public static void main(String[] args) {

		String str1 = "Javaaid";
		String str2 = "Javaid";

		int lengthm = str1.length();
		int lengthn = str2.length();

		int length = longestComSubSqn(str1.toCharArray(), str2.toCharArray(), lengthm, lengthn);

		System.out.println(length);

	}

	// Method3: Using Pure DP solution(bottom up approach)

	private static int longestComSubSqn(char[] x, char[] y, int m, int n) {

		int prev, temp = 0;
//creating array of size m+1, so that all columns can be accommodated.

		int[] memo = new int[n + 1];

		for (int i = 1; i <= m; i++) {

			prev = 0;

			for (int j = 1; j <= n; j++) {
// Here first character of x array is being compared with y array elements. Based on that we are filling memo array.
// For more clarification see java aid video.

				temp = memo[j];
				if (x[i - 1] == y[j - 1]) {

					memo[j] = prev + 1;
				} else {

					memo[j] = Math.max(memo[j], memo[j - 1]);
				}

				prev = temp;
			}

		}

		return memo[n];

	}

}
