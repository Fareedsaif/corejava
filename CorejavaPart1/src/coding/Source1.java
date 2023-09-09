package coding;

import java.util.Arrays;
public class Source1 {
	public int getSecondSmallest(int []arr) {
		Arrays.sort(arr);  
		return arr[1];
	}

	public static void main(String[] args) {
		Source1 s=new Source1();
		int[] arr= {4,8,1,9,5};
		   System.out.println(s.getSecondSmallest(arr));		
	}
		
	}
