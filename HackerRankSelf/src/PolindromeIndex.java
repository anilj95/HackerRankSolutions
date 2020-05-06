
public class PolindromeIndex {

	public static void main(String[] args) {

        String str = "aabccaa";
        
        System.out.print(findIndex(str));

	}
	
	private static int findIndex(String s) {
//aabccaa	
		int polindromeIndex = -1;
		
		int n = s.length();
		
		for(int i = 0;i<n/2;i++) {
			
			if(s.charAt(i)!= s.charAt(n-i-1)) {
				
	//here in sub string method we are taking i+1(not i) assuming by discarding that(ith) element all are palindrome
	// 2nd argument is just n-i not n-i-1 because by default subString method will exclude last element, it will take lastIndex-1;
				boolean isRightStringPalindrome = isValidPolindrome(s.substring(i+1, n-i));
				
				if(isRightStringPalindrome) return i;
				
				return n-i-1;
				
				
						
			}
			
		}
		return polindromeIndex;
	}
	
	private static boolean isValidPolindrome(String str) {
		
		int n = str.length();
		for(int i=0;i<n/2;i++) {
			
			if(str.charAt(i) != str.charAt(n-i-1)) {
				
				return false;
			}
		}
		return true;
	}

}
