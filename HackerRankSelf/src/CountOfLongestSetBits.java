
public class CountOfLongestSetBits {

	public static void main(String[] args) {


		System.out.print(longestCongecutive1s(211184));

	}

	private static int longestCongecutive1s(int number) {

		//String str = Integer.toBinaryString(n);

        //int number = Integer.valueOf(str);
        int count = 0;

        while(number>0){

            number = number & (number << 1);

            count++;
        }

        return count;
		
		
	}

}
