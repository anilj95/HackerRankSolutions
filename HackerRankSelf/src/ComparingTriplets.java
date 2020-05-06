import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class ComparingTriplets {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		ArrayList<Integer> al = new ArrayList<>();

		a.add(5);
		a.add(8);
		a.add(7);
		b.add(4);
		b.add(6);
		b.add(10);

		al = compareTriplets(a, b);
		for (int i = 0; i < al.size(); i++) {

			System.out.print(al.get(i)+" ");
		}

	}

	static ArrayList<Integer> compareTriplets(ArrayList<Integer> a, ArrayList<Integer> b) {

		Integer A = 0, B = 0;
		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < a.size(); i++) {

			if (a.get(i) > b.get(i)) {

				A++;
			} else if (b.get(i) > a.get(i)) {

				B++;
			}
		}

		al.add(A);
		al.add(B);

		return al;

	}

}
