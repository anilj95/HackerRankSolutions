
public class DrawingBook {

	public static void main(String[] args) {

		System.out.print(findNoOfTurn(10, 4));

	}

	private static int findNoOfTurn(int n, int p) {

		int totalNoOfTurn = n / 2;
		int TotalNoOfTurnFromFront = p / 2;

		int TotalNoOfTurnFromBack = totalNoOfTurn - TotalNoOfTurnFromFront;

		return Math.min(TotalNoOfTurnFromFront, TotalNoOfTurnFromBack);

	}

}
