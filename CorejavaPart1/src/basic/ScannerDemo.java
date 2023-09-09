package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws IOException {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter ur name");
		String name=scanner.nextLine();
		System.out.println(" ur name  "+ name);
		
		System.out.println("Enter ur Rollno");
		int rno=scanner.nextInt();
		System.out.println(" ur Roll no  "+ rno); 
		
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter ur name");
		String fname=br.readLine();
		System.out.println(" ur name  "+ fname);
		
		System.out.println("Enter ur no");
		int no=Integer.parseInt(br.readLine());
		System.out.println(" ur no  "+ no);
	
	}

}
