package coding;

import java.util.Scanner;

public class DistanceTravelled {
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		double initialVelocityKmph = 36;
		double acceleration = 5;

// Convert km/hr to m/s
		double initialVelocityMps = initialVelocityKmph * 1000 / 3600;

// Read time intervals
		int timeInterval1 = scanner.nextInt();
		int timeInterval2 = scanner.nextInt();

// Distance for the first time interval
		double distance1 = calculateDistance(initialVelocityMps, acceleration, timeInterval1);

// Distance for the second time interval
		double distance2 = calculateDistance(initialVelocityMps, acceleration, timeInterval2);

// distances in meters
		System.out.println((int) distance1);
		System.out.println((int) distance2);
	}
//a=acceleration , t=time, iV=initial velocity

	public static double calculateDistance(double iV, double a, int t) {
	double distance = iV * t + (0.5 * a * t * t);
	return distance;

		
	}

}
