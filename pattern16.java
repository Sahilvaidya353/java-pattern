package patternprogramming;

public class pattern16 {

	public static void main(String[] args) {
		int row=5;
		int space=5;
		int star=4;
		for(int i=1;i<row;i++) {
			for(int j=1;j<space;j++) {
				System.out.print(j);
			}
			space--;
			System.out.println();
		}
		

	}

}
//1234
// 234
//  34
//   4

