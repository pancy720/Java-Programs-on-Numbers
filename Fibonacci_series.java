package TestPK;

import java.util.*;
public class Fibonacci_series 
{

		 static void  PrintFibonacci(int num) 
		 {
      int  a=0, b=1;
        System.out.print(a+ " " +b);
        int c;
        for(int i=1; i<num; i++)
        {
        	c= a+b;
        	System.out.print(" " +c);
        	a=b;
        	b=c;
        }
		 }

		 
		 public static void main(String args[])
		 {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter a limit: ");
		 int num = sc.nextInt();
			PrintFibonacci(num);
		
		 

	}
}

