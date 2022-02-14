package JUnits;

import java.util.Scanner;

public class Sqrt {
		public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a Number To Find The Square Root : ");
	        int inputNumber = scanner.nextInt();
	        scanner.close();
	        final double epsilon = 1E-15;
	        float t = inputNumber;
	       
	        while (Math.abs(t-inputNumber/t) > epsilon * t) {
	            double lastT = t;
	            t = (float) ((inputNumber/t + t)/2.0);
	            if ( lastT == t) {
	                break;
	            }
	        }
	        System.out.println("Square Root of " + inputNumber + " : " + t);
	    }
	}