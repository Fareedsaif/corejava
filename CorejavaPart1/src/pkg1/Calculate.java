package pkg1;

public class Calculate {
	
	int multiply(int a, int b) {
        return a*b;
    }
	 public int addition(int firstNumber, int secondNumber) {
	        return firstNumber+secondNumber;
	    }
	 private int sum(int a, int b) {
	        return a+b;
	 }        
	        public static void main(String[] args) {    
          Calculate c=new Calculate();
          int result= c.multiply(5, 9);
          System.out.println(result);
}}
