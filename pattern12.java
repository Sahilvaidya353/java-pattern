package patternprogramming;

public class pattern12 {

	public static void main(String[] args) {
		int row = 5;
		int col = 5;
		int space = 5;
		for (int i = 0; i < row; i++) {
			for (int j = 1; j < col; j++) {
				System.out.print(j);
			}
			col--;
			System.out.println();
		}

	}

}
