import java.awt.List;
import java.util.ArrayList;

public class SherlockAndArray {

	public static void main(String[] args) {


		ArrayList<Integer>  list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(3);
		
		
		String str = findBalanceElement(list);
		
		System.out.println(str);
		

	}
	
	private static String findBalanceElement(ArrayList<Integer> arr) {
		
		int x=0;
		int sum =0;
		
		for(int i : arr) {
			
			sum+=i;
		}
		
		for(int y : arr) {
			
			if(2*x == (sum-y)) {
				
				return "YES";
			}
			
			x+=y;
		}
		
		return "NO";
	}

}
