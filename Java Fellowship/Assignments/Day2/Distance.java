// operator program 4. Write a program Distance.java that takes two integer command-line arguments x and y and 
// prints the Euclidean distance from the point (x, y) to the origin (0, 0). The formulae to calculate 
// distance = sqrt(x*x + y*y). Use Math.power function

import java.util.Scanner;
import java.lang.Math;

class Distance {
	public static void main(String args[]) {
	
		int x = Integer.parseInt(args[0]);
		int y  = Integer.parseInt(args[1]);

		double distance = Math.pow((x*x + y*y) , 0.5); 
		System.out.println("Eclidian distance is " + distance);
	}
}