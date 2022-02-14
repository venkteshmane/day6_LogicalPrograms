package logical_Programs;

import java.util.Scanner;

public class PerfectNumber {
	
		public static void checkPerfect() {
			System.out.println("Enter a number to be checked if its perfect or not");
			Scanner sc =new Scanner(System.in);
			int value=sc.nextInt();
			int result=0;
			System.out.print("The dividents are ");
			for(int i=1;i<=value/2;i++)
			{
				if(value%i==0)
				{
					result += i;
					System.out.print(i+" ");
				}
			}
			System.out.println(" ");
			if(result==value)
			{
				System.out.println("It is a Perfect Number");
			}
			else
			{
				System.out.println("It is not a Perfect Number");
			}
			sc.close();
		}

		public static void main(String[] args) {
			checkPerfect();
		}

	}