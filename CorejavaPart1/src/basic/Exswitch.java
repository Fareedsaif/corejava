package basic;

import java.util.Scanner;

public class Exswitch {

	public static void main(String[] args) {
		    int op;
		    int number1, number2, result;
		    Scanner input = new Scanner(System.in);
		    System.out.println("Choose a number: 1,2,3,4");
		    op = input.nextInt();
		    System.out.println("Number==>"+op);
		

		    // ask users to enter numbers
		    System.out.println("Enter first number");
		    number1 = input.nextInt();

		    System.out.println("Enter second number");
		    number2 = input.nextInt();

		    switch (op) {

		      
		      case 1:
		        result = number1 + number2;
		        System.out.println(number1 + " + " + number2 + " = " + result);
		        break;
		      case 2:
			        result = number1 - number2;
			        System.out.println(number1 + " - " + number2 + " = " + result);
			        break;
		      case 3:
			        result = number1 * number2;
			        System.out.println(number1 + " * " + number2 + " = " + result);
			        break;
		      case 4:
			        result = number1 / number2;
			        System.out.println(number1 + " / " + number2 + " = " + result);
			        break;
			  default:
				  
		    }
		   
		    
	}

}
