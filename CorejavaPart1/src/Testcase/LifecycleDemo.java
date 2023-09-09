package Testcase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LifecycleDemo {
	
		@BeforeClass    //before all
		 public static void beforeAll() { 
		System.out.println("Connect to the database");
		}
		@Before   //beforeeach
		public	void beforeEach() { 
		System.out.println("Load the schema");
		}
		@After  //after each test
		public  void afterEach() { 
		System.out.println("Drop the schema");
		}
		@AfterClass   //afterclass only once
		public static void afterAll() {
		System.out.println("Disconnect from the database");
		}
		@Test (timeout=1000)
		public void testOne() { 
		System.out.println("Test One");
		}
		@Test (timeout=2000)
		public void testTwo() { 
		System.out.println("Test Two");
		}
	
}
