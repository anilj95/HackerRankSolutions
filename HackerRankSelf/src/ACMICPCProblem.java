import java.math.BigInteger;

public class ACMICPCProblem {

	public static void main(String[] args) {
		String arr[] = {"1","0","1","0","1"};
		
		int result[] = maxTopicAndTeam(arr);
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.println(result[i]);
		}
		
	}

	private static int[] maxTopicAndTeam(String[] topic) {

		int n = topic.length;

		int maxTopicCount = 0;
		int teamCount = 0;

		BigInteger[] bi = new BigInteger[n];

		for (int i = 0; i < n; i++) {

			bi[i] = new BigInteger(topic[i], 2);
		}

		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {

				BigInteger iuj = bi[i].or(bi[j]);

				int bitCount = iuj.bitCount();

				if (bitCount > maxTopicCount) {

					maxTopicCount = bitCount;

					teamCount = 1;
				} else if (bitCount == maxTopicCount) {

					teamCount++;

				}

			}
		}

		int arrResult[] = { maxTopicCount, teamCount };

		return arrResult;
	}

}
