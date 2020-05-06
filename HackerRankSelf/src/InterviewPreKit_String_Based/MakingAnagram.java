package InterviewPreKit_String_Based;
//Problem: Minimum deletion required to make strings anagram.
public class MakingAnagram {

	public static void main(String[] args) {

		String a = "million";
		String b = "billion";
// for given above strings: output should be: 2 (b & m will be deleted to make anagram)
		int value = makeAnagram(a, b);

		System.out.println(value + " ");

	}

	private static int makeAnagram(String a, String b) {

		int[] a_frequency = new int[26];
		int[] b_frequency = new int[26];

		int min_deletion = 0;

		for (int i = 0; i < a.length(); i++) {

			char current_char = a.charAt(i);
			int ch_to_int = (int) current_char;
			int position = ch_to_int - (int) 'a'; // -a will help in finding position within array index.
// recording occurrence of all char at particular position & incrementing its count.
			a_frequency[position]++;
		}

		for (int i = 0; i < b.length(); i++) {

			char current_char = b.charAt(i);
			int ch_to_int = (int) current_char;
			int position = ch_to_int - (int) 'a';

			b_frequency[position]++;
		}
// calculated occurrence of each char in both array: now difference to find out remaining char
// to get minimum deletion to get anagram(same length,char but different position).
		for (int i = 0; i < 26; i++) {

			int difference = Math.abs(a_frequency[i] - b_frequency[i]);

			min_deletion += difference;

		}

		return min_deletion;
	}

	private static int makeAnagram2(String a, String b) {
		int[] a_frequency = new int[26];
		int[] b_frequency = new int[26];

		int min_deletion = 0;

		for (int i = 0; i < a.length(); i++) {

			char current_char = a.charAt(i);

			int char_to_int = (int) current_char;

			int position = char_to_int - (int) 'a';
			a_frequency[position]++;
		}

		for (int i = 0; i < b.length(); i++) {

			char current_char = b.charAt(i);

			int char_to_int = (int) current_char;

			int position = char_to_int - (int) 'a';
			b_frequency[position]++;
		}

		for (int i = 0; i < 26; i++) {

			int difference = Math.abs(a_frequency[i] - b_frequency[i]);

			min_deletion += difference;

		}

		return min_deletion;

	}
}
