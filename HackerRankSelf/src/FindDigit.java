
public class FindDigit {

	public static void main(String[] args) {


		int num = 1024;
		
		System.out.print(findDigits(num));

	}
	
	private static int findDigits(int n) {
		
		int count =0;
        int num =n;

        while(n>0){

            int remainder = n%10;

            if(remainder!=0 && num%remainder==0){

                count++;
            }
            n = n/10;
        }

        return count;
	}

}
