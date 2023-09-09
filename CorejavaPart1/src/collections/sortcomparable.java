package collections;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
class Employeee implements Comparable<Employeee> {
	private String name;
	private double salary;
	
public Employeee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
		
		
	}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
@Override
public int compareTo(Employeee o) {
	return this.name.compareTo(o.name);
}
public class sortcomparable {

	public static void main(String[] args) {
		List<Employeee> employees = new ArrayList<>(Arrays.asList(
				new Employeee("kapil", 2000),
                new Employeee("amit", 1500),
                new Employeee("dilip", 1000),
                new Employeee("bipasha", 45000)
            ));
		Collections.sort(employees);
        for (Employeee e : employees) {
        	System.out.println(e.getName() + " => " + e.getSalary());
        }}
}}
