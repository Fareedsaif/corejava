package javaEigth;

interface myinterface {
	int add(int a, int b); // only one method will be created inside functional interface
}

interface Evenodd {
	int evenod(int a);
}
interface RevString{
	String rev(String s);
}
public class Lambdaex1 {

	public static void main(String[] args) {
		myinterface mi = (int a, int b) -> a + b;
		System.out.println("sum is......:" + mi.add(5, 4));
		myinterface mi1 = (int a, int b) -> a * b; // we can change logic but method is only one
		System.out.println("multiplication is......:" + mi1.add(5, 4));

		Evenodd eo = (int a) -> {
			if (a % 2 == 0) {
				System.out.println("no is even");
			} else {
				System.out.println("no is odd");
			}
			return a;
		};
		    System.out.println(eo.evenod(8));
		    
 RevString rs=(String s)->{ String rev="";
 for(int i=s.length()-1;i>=0;i--) {
	 char w=s.charAt(i);
	 rev=rev+w;
 }
 return rev;
 };
 }
	}

