package array;

public class MultiDimensionalArray {

	public static void main(String[] args) {

		String[][] data = new String[10][2];

		// Row 1
		data[0][0] = "User1";
		data[0][1] = "Password1";

		// Row 2
		data[1][0] = "User2";
		data[1][1] = "Password2";

		// Row 3
		data[2][0] = "User3";
		data[2][1] = "Password3";

		// Row 4
		data[3][0] = "User4";
		data[3][1] = "Password4";

		// Row 5
		data[4][0] = "User5";
		data[4][1] = "Password5";

		// Row 6
		data[5][0] = "User6";
		data[5][1] = "Password6";

		// Row 7
		data[6][0] = "User7";
		data[6][1] = "Password7";

		// Row 8
		data[7][0] = "User8";
		data[7][1] = "Password8";

		// Row 9
		data[8][0] = "User9";
		data[8][1] = "Password9";

		// Row 10
		data[9][0] = "User10";
		data[9][1] = "Password10";

		for (int r = 0; r < data.length; r++) {
			for (int c = 0; c < data[r].length; c++) {
				System.out.println(data[r][c] + " ");
			}
			System.out.println();

		}
	}

}
