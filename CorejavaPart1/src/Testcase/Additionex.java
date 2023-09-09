package Testcase;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.BeforeClass;
import org.junit.Test;

public class Additionex {
	public int add(int a,int b) {
		return a+b;
	}
	@Test
	public void addTest() {
		Additionex e=new Additionex();
		assertSame("add is wrong", 4, e.add(2, 2));
}
	   
	
	
	
   int a[]= {1,2,3};
   int b[]= {1,2,3};
   int c[]= {1,2,4};
   
   @Test
   public void arrayTest() {
	   assertArrayEquals(a, c);
   }
   
   
   
   
}
