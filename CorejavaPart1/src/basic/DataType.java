package basic;

public class DataType {
	static int i;
	static String g;
	
	public static void main(String[] args) {
		int a=23;
		float b = 23.67f;
		char c= 'a';
		String d = "Welcome";
		String s=new String("Hello");
		int k[]= {1,2,3,4,5};
		String name[]= {"fareed","neha","Abhi"};
		
				System.out.println(a);
		System.out.println(b);
		
		System.out.println(c);
		
		System.out.println(d);
		System.out.println(i);
		System.out.println("Default value of string" + g);
	
		
		System.out.println(k[1]);
		System.out.println(name[2]);
		System.out.println(name.length);
		
	

	}

}
