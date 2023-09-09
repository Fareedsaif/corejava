package basic;
class ValidageException extends Exception {
	
	public ValidageException(String s) {
		super(s);
		
	}
}

public class Validvote {
	void valid(int age) throws ValidageException {
	if(age<18) {
		throw new ValidageException("invalid age");
		
	}
	else {
		System.out.println("valid age");
	}
}


	public static void main(String[] args) {
		Validvote v=new Validvote();
		try {
		v.valid(23);
	}
		catch(ValidageException ee) {
			System.out.println("Execution error");
			System.out.println(ee.getMessage());
			
		}

}
