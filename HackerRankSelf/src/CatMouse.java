
public class CatMouse {

	public static void main(String[] args) {


		int x = 2;
		int y=3;
		int z=4;
		
		System.out.println(findCatMouse(x,y,z));
		
		

	}
	// int x = cat A position ; int y = cat B position ; int z = mouse position
	
	private static String findCatMouse( int x, int y, int z) {
		
		 int a = Math.abs(x-z);
		 int b = Math.abs(y-z);
		 
		 if(a>b) return "cat B";
		 if(b>a) return "cat A";
		 
		 else return "Mouse C";
	}

}
