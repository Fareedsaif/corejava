package nestedloops;

public class Pattern2 {

	public static void main(String[] args) {
		//left triangle
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
//		for (int i=65;i<71;i++) {
//			for (int j=65;j<=i;j++) {
//				char k=(char)j;
//				System.out.print(k+" "); //for printing A,B,c
//			}
//			System.out.println();
//		}
	}

}
