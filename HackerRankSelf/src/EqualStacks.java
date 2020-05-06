import java.util.Stack;

public class EqualStacks {

	public static void main(String[] args) {


		int[] h1 = {3,2,1,1,1};
		int[] h2 = {4,3,2};
		int[] h3 = {1,1,4,1};
		
		System.out.print(equalStack(h1,h2,h3));

	}

	static int equalStack(int[] h1, int[] h2, int[] h3) {

		Stack<Integer> st1 = new Stack<>();
		Stack<Integer> st2 = new Stack<>();
		Stack<Integer> st3 = new Stack<>();

		int st1TotalHeight = 0, st2TotalHeight = 0, st3TotalHeight = 0;
		// pushing total height in place of individual elements

		for (int i = h1.length - 1; i >= 0; i--) {

			st1TotalHeight += h1[i];

			st1.push(st1TotalHeight);
		}
		for (int i = h2.length - 1; i >= 0; i--) {

			st2TotalHeight += h2[i];

			st2.push(st2TotalHeight);
		}
		for (int i = h3.length - 1; i >= 0; i--) {

			st3TotalHeight += h3[i];

			st3.push(st3TotalHeight);
		}
		
		while(true) {
			
			
			
			// two corner cases 1. empty or 2. equal heights
			
			if(st1.isEmpty() || st2.isEmpty() || st3.isEmpty()) {
				
				return 0;
			}
			
			st1TotalHeight = st1.peek();
			st2TotalHeight = st2.peek();
			st3TotalHeight = st3.peek();
			
			if((st1TotalHeight == st2TotalHeight) && (st2TotalHeight == st3TotalHeight) ) {
				
				return st1TotalHeight;
			}
			
// find the stack of max sum & remove it
			
			if((st1TotalHeight>= st2TotalHeight) && (st1TotalHeight>= st3TotalHeight) ) {
				
                     st1.pop();
			}else if((st2TotalHeight>= st3TotalHeight) && (st2TotalHeight>= st1TotalHeight)) {
				
				st2.pop();
			}else if((st3TotalHeight>= st2TotalHeight) && (st3TotalHeight>= st1TotalHeight)) {
				
				st3.pop();
			}
		}
	}

}
