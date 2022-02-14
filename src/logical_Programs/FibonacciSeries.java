package logical_Programs;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static void getSeries() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the limit until you want the Fiboncci Series :");
		int limit=sc.nextInt();
		int series[]=new int[limit];
		series[0]=0;
		series[1]=1;
		for (int i=2;i<series.length;i++)
		{
			series[i]=series[i-1]+series[i-2];
			
		}
		for(int j:series)            //for each loop to display array elements
		{
			System.out.print(j+" ");
		}
		sc.close();
	}
	public static void main(String[] args) {
		getSeries();
	}
}