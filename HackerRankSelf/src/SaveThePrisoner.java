//Link : https://www.youtube.com/watch?v=LeNU3WjrV_w
public class SaveThePrisoner {

	public static void main(String[] args) {

    int noPrisoner = 7;
    int noCandy = 19;
    int startPosition = 2;
    // find the prisoner who will get bad candy.
    
    int prisoner = savePrisoner(noPrisoner,noCandy,startPosition);
    
    System.out.println(prisoner+"th position prisoner got bad candy");

	}

	private static int savePrisoner(int n, int m, int s) {
		// n = no. of prisoner
		// m = no. of candy
		// s = stating position from which candy is being distributed.

		int r = m % n; // r = remainder
	// if started from 1st prisoner (s=1) only r%n will remain, but for general case we took s-1, 	

		if ((r + (s - 1)) % n == 0) {// this case deals with equal distribution of candy, so last prisoner will get awful candy.

			return n;
		} else {

			return (r + (s - 1)) % n;
		}

	}

}
