package javaEigth;
@FunctionalInterface 
interface Display {
	void dis1();
}

public class methodefex1 {
	public void msg() {
		System.out.println("method ref in java 8");
	}

	public static void main(String[] args) {
		methodefex1 m=new methodefex1();
		m.msg();
		System.out.println("************");
		Display ref=m::msg;   //set reference to interface Display
		ref.dis1();    //using reference we calll
	}

}
