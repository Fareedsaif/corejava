package oops;

public class MethodOverLoadingPolymor {
	void add(int a) {
		System.out.println("sum : " + a);
	}
   void add(int a, int b) {
	   System.out.println("sum of"+ a + "+"+ b + ":" + a+b);
   }
   
   void add(int a, float b) {
	   System.out.println("sum of"+ a + "+"+ b + ":" + a+b);
   }
    
   void add(float a, float b) {
	   System.out.println("sum of"+ a + "+"+ b + ":" + a+b);
   }	   
	  int add(int a, int b, int c) {
		  return a+b+c;
   }
	public static void main(String[] args) {
		MethodOverLoadingPolymor m= new MethodOverLoadingPolymor();
		m.add(5);
		m.add(5, 10);
		m.add(2, 4.5f);
		m.add(4.3f, 5.9f);
	int	s=m.add(1, 3, 5);
	System.out.println(s);
		
	}

}
