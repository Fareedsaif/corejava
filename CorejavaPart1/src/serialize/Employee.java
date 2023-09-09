package serialize;

import java.io.Serializable;

public class Employee implements Serializable{
	public int id;
	public String name;
	
	public void display() {
		System.out.println("Name:" +name  +" " +"ID: " + id);
	}
	

}
