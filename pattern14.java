package patternprogramming;

public class pattern14 {

	public static void main(String[] args) {
		int s=5;
		for(int i=0;i<5;i++) {
			for(int j=i;j<5;j++) {
				System.out.print(s);
			}
			s--;
			System.out.println();
		}

	}

}