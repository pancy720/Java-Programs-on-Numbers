package TestPK;


// sqrt_n+1 = (sqrt_n + (num/sqrt_n))/2.0

import java.util.*;
public class Sqrt_UsingFormula {

	public static double squareRoot(int num) {
		double t;
		double sqrtroot = num/2;
		do
		{
			t=sqrtroot;
			sqrtroot = (t+(num/t))/2;
		}
		while((t-sqrtroot)!=0);
		return sqrtroot;
	
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		
			System.out.println("The square root of "+ num+ " is: "+squareRoot(num)); 
		

}
	}
