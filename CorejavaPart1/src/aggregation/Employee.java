package aggregation;

public class Employee {
	private job j;
	public Employee() {
		this.j=new job();
		j.setId(12);
		j.setName("fareed");
		
		
	}
	int display() {
		return j.getId();
		
	}
	
	String display1() {
		return j.getName();
		
	}
	

}
