package oops;

public class MethodOverLoadingPolymor1 {
	static int add(int a , int b) {
		return a+b;
		
	}
	
	static int add(int a , int b, int c) {
		return a+b+c;
	}
		static float add( float a , int b) {
			return a+b;
			
		}
	public static void main(String[] args) {
	System.out.println(MethodOverLoadingPolymor1.add(5.1f, 6));
	System.out.println(MethodOverLoadingPolymor1.add(2, 4, 6));
	System.out.println(MethodOverLoadingPolymor1.add(3, 5));
	}

}
