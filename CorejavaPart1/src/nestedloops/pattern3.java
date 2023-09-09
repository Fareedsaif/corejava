package nestedloops;

public class pattern3 {
	
		public static void pattern(int n)
		{
			int i,j;
			for(i=n;i>=1;i--) {
				for(j=1;j<=i;j++) {
					System.out.print(  " * ");
				}
				System.out.println();
			}
		}
		public static void main(String args[]) {
			int n=6, m=4, o=2;
			pattern(n);
			pattern(n);
			pattern(n);
	
				
	
		}
}
