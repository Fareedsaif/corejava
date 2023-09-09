package basic;

public class Operators {

	public static void main(String[] args) {
		int a=10;
		
		int b=20;
		int x=++a;
		int y=b++;
		System.out.println("------Increment Operator------");
		
		System.out.println("pre increment  "+x);
		System.out.println("post increment  "+y);
		
				
		System.out.println("------Arithmetic Operator------");
	
		
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int mod =a%b;
		
		
		System.out.println("Addition    "+sum);
		System.out.println("Subtraction  "+sub);
		
		System.out.println("Multiplication  "+mul);
		
		System.out.println("Division   " +div);
		
		System.out.println("Modulus  "+mod);
		System.out.println("------Relational Operator------");

		System.out.println("a>b  "+ (a>b));
		System.out.println("a<b  "+ (a<b));
		System.out.println("a==b  "+ (a==b));
		 
		System.out.println("------Bitwise Operator------");
		System.out.println("a|b  "+ (a|b));
		System.out.println("a&b  "+ (a&b));
		System.out.println("a~b  "+ (a>b));
		System.out.println("a^b  "+ (a^b));
		System.out.println("------ternary Operator------");
		
		int f=4;
		int g=2;
		int max=f>g?f:g;
		System.out.println("max "+ max);
			
		

		//check whether no id even or odd
		int no=5;
		String result=no%2==0?"Even":"Odd";
		System.out.println(result);
		


		
		
		
	}

}
