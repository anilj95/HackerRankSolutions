import java.util.Arrays;

public class BiggerIsGreater {

	public static void main(String[] args) {
		String str = "ecdigf";

		System.out.print(biggerGreater(str));

	}

	private static String biggerGreater(String str) {
		// ecdigf : given string

		char[] ch = str.toCharArray();
		int endIndex = 0;
		int n = ch.length;

		for (endIndex = n - 1; endIndex > 0; endIndex--) {

			if (ch[endIndex] > ch[endIndex - 1])
				break;
		}
		// array is already in descending order
		if (endIndex == 0) {

			return "No Answer";
		} else {

			int firstSmallChar = ch[endIndex - 1];
			int nextSmallChar = endIndex; // temp variable to hold index no.

			// finding smallest char in array after (endIndex-1)th position to n.

			for (int i = endIndex + 1; i < n; i++) {

				if (ch[i] > firstSmallChar && ch[i] < ch[nextSmallChar]) {

					nextSmallChar = i;
				}
			}

			// now swap both char to make ascending order

			swap(ch, endIndex - 1, nextSmallChar);

			// sort Array after (endIndex-1)th to end

			Arrays.sort(ch, endIndex, n);

		}

		return new String(ch);

	}

	private static void swap(char[] ch, int i, int j) {

		char temp = ch[i];

		ch[i] = ch[j];
		ch[j] = temp;
	}

}
