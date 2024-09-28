package patternprogramming;

public class pattern10 {

	public static void main(String[] args) {
		int row = 6;
		int col = 2;
		for (int i = 1; i < row; i++) {
			for (int j = 1; j < col; j++) {
				System.out.print(i % 2);
			}

			System.out.println();
			col++;
		}
	}
}
