/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

// import java.util.Scanner;
// uncomment the above line to use input in your program.

import java.util.Scanner;

public class Gravity {

	public static void main(String[] args) {
		Scanner time = new Scanner(System.in);
		double t = time.nextDouble();
		double g = 9.8;
		double s = g * t;
		double d = 0.5 * g * t * t;
		System.out.println("The speed of the object at " + t + " seconds after its release is " + s + " and the distance the object has travelled in the " + t +" seconds after the relase is " + d);





	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
