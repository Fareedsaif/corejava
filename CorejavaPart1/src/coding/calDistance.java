package coding;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class calDistance {
	public static int calDis(double u,int a,int t) {
		 return (int)(u*t+(0.5*a*t*t));
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter two time intervals..");
		int t1=Integer.parseInt(br.readLine());
		int t2=Integer.parseInt(br.readLine());
		int u1=36;double u=(36*1000)/3600;
		int a=5;
		System.out.println(calDis(u, a, t1));
		calDis(u, a, t2);
		
       
	}

}
