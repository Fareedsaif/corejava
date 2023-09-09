package function;
class Welcome{
	static void display(String n) {
		System.out.println("Hello" + n);
	}
}

public class FunctionEx {
	void add(int a,int b) {
		System.out.println("Addition: "+ (a+b));	
	}
	
	void sub(int a,int b) {
		System.out.println("Substraction: "+ (a-b));	
	}
	
	 static void mul(int a,int b) {
		System.out.println("Multiplication: "+ (a*b));	
	}
	 
	float div(int a,int b) {
			return a/b;
			
		}
		

	public static void main(String[] args) {
		FunctionEx f=new FunctionEx();
		f.add(5, 6);
		f.sub(10, 5);
		mul(5, 6);
		System.out.println("Division: "+ f.div(13,2));
		
		
		
		//another class
		
		Welcome.display("Fareed");
		
		
	
		
	}

}

