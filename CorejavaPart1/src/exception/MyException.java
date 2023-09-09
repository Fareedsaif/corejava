package exception;

import java.util.Scanner;

 class CheckNameException extends Exception{
	public CheckNameException(String s) {
		super(s);
		
	}}
public class MyException {
	public String checkName(String fname, String lname) throws CheckNameException {
		if (fname.isEmpty()) {
			throw new CheckNameException ("fname is empty");}
			else if  (lname.isEmpty()) {
				throw new CheckNameException("lname is empty");}
			else {
				return "welcome" + fname+ lname;
				
		}
	}

	public static void main(String[] args) {
		MyException c=new MyException();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First name");
		String fname=sc.nextLine();
		System.out.println("Enter last name");
		String lname=sc.nextLine();
		String s;
		try {
			s=c.checkName(fname, lname);
			System.out.println(s);
		}catch (CheckNameException e) {
			System.out.println(e);
		}
		
		
	}

}
