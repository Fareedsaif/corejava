package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class hashsetex {

	public static void main(String[] args) {
//		HashSet<String> hs=new HashSet<String>();
//		hs.add(null);
//		hs.add("Fareed");
//		hs.add("inam");
//		hs.add("neha");
//		hs.add("Fareed");
//		hs.remove("neha");
//	System.out.println(hs);
//	
	
//	TreeSet<String> hp=new TreeSet<String>();   //for ascending order
//	
//	hp.add("Fareed");
//	hp.add("inam");
//	hp.add("neha");
//	hp.add("xyz");
//	hp.add("pooja");
//System.out.println(hp);
//System.out.println("*****Using Enhanced for loop********");
//for(String i:hp) {
//	System.out.println(i);
//}
//System.out.println("*****Using Iterator************");
//Iterator<String> i = hp.iterator();
//while(i.hasNext()) 
//    System.out.println(i.next());
		
		List<String> sample_list = new ArrayList<String>();
		 
        sample_list.add(“practice”);
        sample_list.add(“solve”);
        sample_list.add(“interview”);

       
        System.out.println("The initial list is : "
                           + sample_list);

      
        List<String>
            read_only_list = Collections
                                .unmodifiableList(sample_list);

    
        System.out.println("The ReadOnly ArrayList is : "
                           + read_only_list);

        
        System.out.println("Trying to modify the ReadOnly ArrayList.");                       
        read_only_list.add(“job”);
    

}

	
	
	}


