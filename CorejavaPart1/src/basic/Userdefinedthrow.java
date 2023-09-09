package basic;

public class Userdefinedthrow {
	static void valid(int age) {
		if(age<18) {
			throw new ArithmeticException("invalid age");
			
		}
		else {
			System.out.println("valid age");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
valid(45);
	}

}
