package javaEigth;

import java.util.Arrays;
import java.util.List;

public class lambdaEx {

	public static void main(String[] args) {
		List<Integer> intSeq = Arrays.asList(1,2,3);
		intSeq.forEach(x -> System.out.println(x));
		
		
		
		
		//multiline
		List<Integer> intSeq1 = Arrays.asList(1,2,3);
		intSeq1.forEach(x -> { x+= 2; 
		System.out.println(x);
		});


	}

}
