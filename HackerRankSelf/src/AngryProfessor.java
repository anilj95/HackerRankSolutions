
public class AngryProfessor {

	public static void main(String[] args) {

    int[] arr = {0,-1,0,-1,1,2};
    
    int k = 4;
    
    System.out.println(isClassCancelled(arr,k));

	}
	
	private static String isClassCancelled(int[] arr, int k) {
		
		int count=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]<=0) {
				
				count++;
			}
		}
		
		return count>=k ?"NO" :"YES";
		
		
	}

}
