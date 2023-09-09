package oops;

interface Parentone {
	void display1();

}

interface Parenttwo {
	void display2();

}

interface Parent3 extends Parentone, Parenttwo { // interface to interface extends
	void display3();

}

class Child123 implements Parent3 { // interface to class implements

	@Override
	public void display1() {
		System.out.println("parentone");

	}

	@Override
	public void display2() {
		System.out.println("parenttwo");

	}

	@Override
	public void display3() {
		System.out.println("parentthree");

	}

}

public class MultipleInheritance {

	public static void main(String[] args) {
		Child123 c = new Child123();
		c.display1();
		c.display2();
		c.display3();
	}

}
