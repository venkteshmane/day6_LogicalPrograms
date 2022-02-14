package logical_Programs;

import java.util.Scanner;

public class Stopwatch {
	//initializing start variable
	static long start;
	/*
	 * This method stores the start time and returns it.
	 * @return returns the start time
	 */
	public static long startTime() {
        start = System.currentTimeMillis();
        return start;
    } 
	/*
	 * This method calculates the time in the stopwatch and prints the time
	 * taken to complete action
	 */
	public static void elapsedTime() {
        long now = System.currentTimeMillis();
		 System.out.println((now - start) / 1000.0);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 0 to start the Stopwatch");
		int starts=sc.nextInt();
		if(starts==0);
		startTime();
		System.out.println("Press 1 to end the Stopwatch");
		int ends=sc.nextInt();
		System.out.println("The elapsed time is:");
		if(ends==1)
		elapsedTime();
		sc.close();
	}

}