package collections;

import java.util.HashSet;

public class setex {

	public static void main(String[] args) {
		HashSet<Integer> num1=new HashSet<Integer>();
		num1.add(2);
		num1.add(4);
		num1.add(6);
		System.out.println(num1);
		
		HashSet<Integer> num2=new HashSet<Integer>();
		num2.add(2);
		num2.add(5);
		num2.add(7);
		System.out.println(num2);
		
		
		num1.addAll(num2);
		System.out.println("Union"  +num1);
		
		num1.retainAll(num2);
		System.out.println("intersection"  +num1);
		
		num1.removeAll(num2);
		System.out.println("less"  +num1);
		
		
	}

}
