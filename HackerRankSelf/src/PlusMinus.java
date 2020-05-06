
public class PlusMinus {

	public static void main(String[] args) {


		
		int[] arr = {-1,0,-3,4,6,7};
		
		findFormat(arr);

	}
	
	private static void findFormat(int[] arr) {
		
		int leng = arr.length;
		
		float positiveCount =0;
		float negativeCount =0;
		float zeroCount =0;
		
		for(int i=0; i<leng;i++) {
			
			if(arr[i]>0) positiveCount++;
			
			if(arr[i]<0) negativeCount++;
			
			if(arr[i]==0) zeroCount++;
			
		}
		
		System.out.printf("%1.6f\n",positiveCount/leng);
		System.out.printf("%1.6f\n",negativeCount/leng);
		System.out.printf("%1.6f\n",zeroCount/leng);
		
		
	}

}
