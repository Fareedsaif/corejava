package collections;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylistex1 {

	public static void main(String[] args) {
		ArrayList<Integer> ab=new ArrayList<Integer>();
	    ab.add(12);
	    ab.add(23);
	    ab.add(2, 54);
	    ab.add(5);
	    System.out.println(ab);
	    System.out.println(ab.size());
	    ab.remove(1);
	    System.out.println(ab);
	    ab.set(1, 100);
	    System.out.println(ab);
	    
	    ArrayList<String> as=new ArrayList<>();
	    as.add("Fareed");
	    as.add("inam");
	    as.add("neha");
	    as.remove(1);
	   // as.add(null);
	    as.add("dinu");
	    as.add("hema");
	    as.add("Fareed");
	    System.out.println(as);
	    ArrayList<String> as1=new ArrayList<String>();
	    as1.addAll(as);
	    System.out.println(as1);
	    as1.remove("neha");
	    System.out.println(as1);
	    Collections.sort(as);
	    for (String str:as) {
	    	System.out.println(str);
	    }
	    
		
		
	}

}
