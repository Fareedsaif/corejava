package collections;
class Student12{
	int id;
	String name;
	
	public Student12 setId(int id) {
		this.id = id;
		return this;
	}
	
	public Student12 setName(String name) {
		this.name = name;
		return this;
	}
	 void display() {
		 System.out.println("id  :" + id + "name  :" + name);
	 }
	
}

public class methodchain {

	public static void main(String[] args) {
		Student12 s=new Student12();
		s.setId(12).setName("fareed").display();  //methodchaining
		
	}

}
