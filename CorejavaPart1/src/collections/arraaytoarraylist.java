package collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class arraaytoarraylist {

	public static void main(String[] args) {
		String sample_array[]
		           = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		       
		       int length_array = sample_array.length;
		       System.out.println("The input elements are as follows : ");
		       for(int i = 0; i < length_array; i ++)
		       {
		           System.out.print(sample_array[i] + " ");
		       }
		       System.out.println();
		   
		       List converted_list = Arrays.asList(sample_array);// converting the array to a list
		       
		       
		       System.out.println("The converted list is as follows : "
		                          + converted_list);
		       Collections.sort(converted_list);
		       System.out.println("The sort converted list is as follows : "
                       + converted_list);
		       
		       
		       Collections.reverse(converted_list);
		       System.out.println("The reverse converted list is as follows : "
                       + converted_list);
		       
		       List<Integer> list = Arrays.asList(10, 4, 2, 6, 5, 8);
		        Collections.sort(list, Collections.reverseOrder());
		 
		        System.out.println(list);
		        
		        
		        List<Integer> list1 = Arrays.asList(10, 4, 2, 6, 5, 8);
		        
		        Collections.sort(list1);
		        Collections.reverse(list1);
		 
		        System.out.println(list1);
    
	}

}
