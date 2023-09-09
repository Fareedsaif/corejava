package pkg2;
import pkg1.Calculate;

public class program {

	public static void main(String[] args) {
//		    int A = 10;
//	        int B = 15;
	        Calculate cal = new Calculate();
	        int result= cal.addition(5, 10);
	    //    int sum= cal.sum(5,11);   private method we cant able to access
	        
	 
	        //Printing A + B
	        System.out.println("We get: " + result);
	}

}
