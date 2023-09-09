package oops;
import java.lang.Exception;


public class CheckedException {

	public static void main(String[] args) {
		try {
		Class.forName("basic.addition");
		
		
			System.out.println("class found");
		}
		
	catch(Exception e)	
		{
		System.out.println("class not found  "+ e);
		}
		finally {
			System.out.println("final block");
		}
		
		
		
		}
	}


