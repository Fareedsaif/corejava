package nestedloops;

public class Pyramid1 {
	public static void Pyramid(int n) {
		for (int i=1;i<=n;i++) {
			for(int j=1; j<=n-i;j++) { //for printing space
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++) {
				System.out.print("* ");	//for printing *    // (i+" ")    (j+" ")
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Pyramid(7);
	}

}
