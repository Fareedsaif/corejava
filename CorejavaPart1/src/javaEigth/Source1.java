package javaEigth;

import java.util.Scanner;

@FunctionalInterface
interface validate {
boolean isValid(String firstName, String lastName);
}

public class Source1 {
	boolean validate(String username,String password)
	{
	validate v=(str1,str2)->{return(str1.equals("ABC") && str2.equals("DEF"))?
	true:false;};
	return v.isValid(username,password);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String uname="Alexa";
		String pass="coded123";
		Source1 s=new Source1();
		System.out.println(s.validate(uname,pass));

	}

}
