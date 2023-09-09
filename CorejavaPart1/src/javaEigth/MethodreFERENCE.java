package javaEigth;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.sql.rowset.serial.SQLOutputImpl;

public class MethodreFERENCE {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(122, 56, 43, 22, 13, 5, 59,56);
		System.out.println("My List :"+num);
		
		num.forEach(System.out::print);   //using single line we print
		System.out.println("***********************");
		num.forEach(e->System.out.println(e)); //using lambda
		System.out.println("***********************");
		System.out.println("lambda func.....");
		Collections.sort(num, (i1,i2) -> i1.compareTo(i2));
		num.forEach(System.out::print);
		
		System.out.println("***********************");
		
		
		
		
	}
	

}
