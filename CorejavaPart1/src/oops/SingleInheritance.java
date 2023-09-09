package oops;
class Student {
	 String name;
	void display() {
		System.out.println("student name :" + name);
	}
}
	class  Dept extends Student {
		String departmentName;
		void display1() {
			System.out.println("Department name :" + departmentName);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		Dept d=new Dept();
		d.name="fareed";
		d.display();
		d.departmentName="computer"	;
		d.display1();
		
		
	}

}
