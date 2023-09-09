package collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class hashtableex {

	public static void main(String[] args) {
		Hashtable<Integer, String> h=new Hashtable<Integer, String>();
		h.put(1, "fareed");
		h.put(2, "neha");
		h.put(3, "mohit");
		h.put(4, "patel");
		System.out.println(h);
		
		
		Map<Integer, String> m=new HashMap<Integer, String>();
		m.put(1, "fareed");
		m.put(2, "neha");
		m.put(3, "mohit");
		m.put(4, "patel");
		m.putIfAbsent(5, "gita");
		m.containsValue(null);
		m.containsKey(m);
		System.out.println(m);
		
		

	}

}
