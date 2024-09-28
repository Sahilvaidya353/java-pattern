package patternprogramming;

public class pattern19 {
	public static void main(String[] args) {
		int star=1;
		int intialspace=4;
		//int space=3;
		for(int i=0;i<5;i++) {
			for(int k=0;k<intialspace;k++) {
				System.out.print(" ");
			}
			intialspace--;
			for(int j=0;j<star;j++) {
				//if()
				System.out.print("*");
			}
			star+=2;
			System.out.println();
			
		}
	}
}
