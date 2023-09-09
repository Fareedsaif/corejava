package oops;
class StudentN {
	 String name;
	void display() {
		System.out.println("student name :" + name);
	}
}
	class  DeptN extends Student {
		String departmentName;
		void display1() {
			System.out.println("Department name :" + departmentName);
	}
}
	class University extends Dept {
		String universityName;
		void display2() {
			System.out.println("university name :" + universityName );
			
	}
	}
public class MultilevelInheritance {

	public static void main(String[] args) {
		University u= new University();
		u.name="fareed";
		u.display();
		u.departmentName="computer"	;
		u.display1();
		u.universityName= "Madras University";
				u.display2();
	}

}
