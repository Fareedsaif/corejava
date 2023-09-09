package constructor;

public class Learner {
int id;
String name;
private String password;

	public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

	public Learner(int i, String name) {
	super();
	this.id = id;
	this.name = name;
	System.out.println("id"+ id +"Name " + name );
}

	public Learner() {
		id=22;
		name="Sayeed";
			System.out.println("id"+ id +"Name " + name +  password);
	}	
	
	
	
	public static void main(String[] args) {
	Learner l=new Learner(23, "Fareed");
	Learner l1=new Learner();

	

	}

}
