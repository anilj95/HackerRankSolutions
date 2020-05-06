
public class SeperateNumber {

	public static void main(String[] args) {

      String str = "99100101";
      String str2 = "9910011";
      
      isBeautiful(str2);

	}
	private static void isBeautiful(String str) {
	//91011	
		boolean isValid = false;
		String substring = "";
	// iterating upto half of the length because, all valid digits(1,10,100) can be covered up to half.
		
		for(int i=1;i<str.length()/2 ;i++) {
			
			 substring = str.substring(0,i);
			 
			 String validSubString = substring;
			 
			 Long num = Long.parseLong(validSubString);
			 // appending with incremented no. up to the length of original string
			 while(validSubString.length()<str.length()) {
				 
				 validSubString+= Long.toString(++num);
			 }
			 
			 if(str.equals(validSubString)) {
				 
				 isValid = true;
				 break;
			 }
		}
		
		System.out.println(isValid? "YES "+ substring : "NO");
		
		
	}

}
