package javaEigth;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class Dateex {

	public static void main(String[] args) {
		LocalDate d=LocalDate.now();
		System.out.println("DATE:" + d);
		LocalDate d1=LocalDate.of(2023, 8, 24);
		System.out.println("SPECIFIC DATE  :" + d1);
		LocalDate d2=LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current IST :" + d2);
		
		//Time
		LocalTime t=LocalTime.now();
		System.out.println("TIME:" + t);
		LocalTime t1=LocalTime.of(15, 34, 46);
		System.out.println("SPECIFIC TIME:" + t1);
		LocalTime t2=LocalTime.now(ZoneId.of("America/Chicago"));
		System.out.println("TIME ZONE USA:" + t2);
	     
		
		
		
		
		
		

	}

}
