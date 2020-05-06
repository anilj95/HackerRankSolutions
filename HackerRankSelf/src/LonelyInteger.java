//In a given array, all elements are repeated twice except one , find that lonely integer.(was asked to Ashish Tyagi)
//Condition: no extra space, time complexity should be O(n).
public class LonelyInteger {

	public static void main(String[] args) {

    int[] arr = {1,2,3,4,3,2,1};
    
    int lonely = lonelyInt(arr);
    
    System.out.println(lonely);

	}

	private static int lonelyInt(int[] arr) {

		int result = 0;
		for (int i = 0; i < arr.length; i++) {

			result = result ^ arr[i];
		}
		return result;
	}

}
