package nestedloops;

public class NestedLoops {
//right triangle
	public static void main(String[] args) {
		for (int i=1;i<5;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j+" "); //instead of i we put *
			}
			System.out.println();
		}
			
//		for (int i=1;i<5;i++) {
//			for (int j=1;j<=i;j++) {
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		
		
	}

}
