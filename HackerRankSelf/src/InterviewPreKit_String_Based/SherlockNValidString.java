package InterviewPreKit_String_Based;

import java.util.ArrayList;
import java.util.HashMap;

public class SherlockNValidString {

	public static void main(String[] args) {


		String str1 = "aabbcd";
		String str2 = "aabbccddeefghi";
		String str3 = "abcdefghhgfedecba";
		
		System.out.println(isValid(str3));

	}
	// checking occurrence of each character is same or not.
	private static boolean is_all_same(ArrayList<Integer> arr) {
		
		int first = arr.get(0);
		
		for(int i=0;i<arr.size(); i++) {
			
			if(arr.get(i)!= first) {
				
				return false;
			}
		}
		
		return true;
	}

	private static String isValid(String str) {

		// aabbcd

		HashMap<Character, Integer> hs = new HashMap<Character, Integer>();

		for (int i = 0; i < str.length(); i++) {

			char ch = str.charAt(i);

			if (hs.containsKey(ch)) {

				hs.put(ch, hs.get(ch) + 1);
			} else {

				hs.put(ch, 1);
			}

		}

		// 'a' : 2 ,'b' : 2 , 'c':1 , 'd' : 1

		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (Character i : hs.keySet()) {

			arr.add(hs.get(i));
		}

		// arr : 2,2,1,1

		if (is_all_same(arr)) {

			return "Yes";
		}

		// 4 possibilities of being valid string: after removal of one occurrence at a 
		// time from each character.
		// 1 2 1 1
		// 2 1 1 1
		// 2 2 0 1
		// 2 2 1 0
		for (int i = 0; i < arr.size(); i++) {

			int index = arr.indexOf(arr.get(i));
			int temp = arr.get(i);

			arr.set(index, temp - 1);

			if (is_all_same(arr)) {

				return "Yes";
			}
			arr.set(index, temp);

		}
		
		return "NO";

	}

}
