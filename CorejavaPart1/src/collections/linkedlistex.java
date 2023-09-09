package collections;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class linkedlistex {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(50);
		l1.add(32);
		l1.addFirst(64);
		l1.add(77);
		System.out.println(l1);
		Stack<Integer> s=new Stack<Integer>();
		s.push(43);
		s.push(12);
		s.push(77);
		s.push(10);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());
		
		
		Vector<Integer> v=new Vector<Integer>();
		

	}

}
