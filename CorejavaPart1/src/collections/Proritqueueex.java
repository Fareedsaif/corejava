package collections;

import java.util.PriorityQueue;

class Employee implements Comparable<Employee>{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	@Override
    public int  compareTo(Employee employee) {
        if(this.getId() > employee.getId()) {
            return 1;
        } else if (this.getId() < employee.getId()) {
            return -1;
        } else {
            return 0;
        }	
    }
	
}

public class Proritqueueex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Employee> e=new PriorityQueue<Employee>();
		e.add(new Employee(4, "fareed"));
		e.add(new Employee(1, "ibrahim"));
		e.add(new Employee(8, "maaz"));
		e.add(new Employee(2, "inam"));
		 System.out.println(e);
		 
//		 System.out.println("***********************");
//		 for (Employee ee:e) {
//			 System.out.println(ee);
//		 }
			
			while (!e.isEmpty()) {
		            System.out.println(e.remove());   //while loop is important to get the order
		        }


	}
}

