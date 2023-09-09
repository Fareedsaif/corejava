package oops;
class Father {
	String name="sharaf";

 void display() {
	 System.out.println("Father class");
	 
 }
} 
class Son extends Father {
	String name="fareed";
	
void display() {
	//super.display();
	 System.out.println("child class");
	 
}
}
public class SuperMethod {

	public static void main(String[] args) {
		
	Son s=new Son();
	s.display();;
	
	
}
}