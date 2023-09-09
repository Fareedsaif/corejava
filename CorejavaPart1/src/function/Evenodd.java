package function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Evenodd {
	void check(int no){
		
	 if (no%2==0) { 
		  System.out.println(no +"is even"); } 
		  else {
		  System.out.println(no +"is odd"); }	  
	
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		
				Evenodd c=new Evenodd();
				System.out.println("Enter a no");
				BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				int no=Integer.parseInt(br.readLine());
				c.check(no);
				
				
			}

	}


