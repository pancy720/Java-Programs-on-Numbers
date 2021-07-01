package TestPK;

import java.util.*;
public class prime_no 
{
 
	public static boolean isPrime(int n)
	{
		if(n == 0 || n == 1)
		{
			return false;
		}
	for(int i = 2; i<= Math.sqrt(n); i++)
		if(n% i == 0)
		{
			return false;
		}
	
	return true;
 }
	
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a num: ");
	int n = sc.nextInt();

	boolean check = (isPrime(n));
	
	 if (check)
	 {
		 System.out.println(n+ " is prime no");
	 }
	 else
	 {
		 System.out.println(n+ " is not prime");
	 }
	 }
	}

