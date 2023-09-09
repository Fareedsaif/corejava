package collections;

import java.util.HashSet;

class department {
	int did;
	String dname;
	public department(int did, String dname) {
		super();
		this.did = did;
		this.dname = dname;
	}
	
}

public class Hashsetex1 {

	public static void main(String[] args) {
		HashSet<department> ab=new HashSet<department>();
		ab.add(new department(123, "marketing"));
		ab.add(new department(124, "IT"));
		ab.add(new department(125, "sales"));
		System.out.println(ab);
		System.out.println("*************"); 
		for(department d:ab) {
			System.out.println("Id"   + d.did);
			System.out.println("name"   + d.dname);
		}
		
}

}
