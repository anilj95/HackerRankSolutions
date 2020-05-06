
public class PickingNumbers {

	public static void main(String[] args) {


		int[] arr = {1,1,1,2,2,3,3,4,4,5,5};
		
		System.out.println(pickMaxLength(arr));
		

	}
	
	private static int pickMaxLength(int[] arr) {
		
		int result = Integer.MIN_VALUE;
		int[] frequency = new int[101];
		
		int index =0;
		
		for(int i =0;i<arr.length;i++) {
			
			index = arr[i];
			frequency[index]++;
		}
		
		for(int i=1;i<frequency.length;i++) {
			
			result = Math.max(result, frequency[i] + frequency[i-1]);
		}
		
		return result;
		
		
	}

}
