package oops;

abstract class AbstractEx1 {
	abstract void display();   //abstract method

	void msg() {                         //non abstract method
		System.out.println("HELLO");
	}
	static void show() {
		System.out.println("static method in abstract");
	}
	final void dis() {
		System.out.println("fianl");
	}
}

class Child extends AbstractEx1 {

	@Override
	void display() { // must create this
		System.out.println("child");
	}

}

class Child1 extends AbstractEx1 {

	@Override // this also not need
	void display() {
		System.out.println("child1");
	}

}

public class AbstractClassEx {

	public static void main(String[] args) {
		Child1 c1 = new Child1();
		Child c = new Child();
		c1.display();
		c1.msg();
		c1.display();
		c.display();
		AbstractEx1 abref; // creating reference for abstract class..we cant able to create object for abs
							// class
		abref = c1;
		abref.display();
		abref.msg();
		c.dis();
		
		AbstractEx1.show();     //static method
	}

}
