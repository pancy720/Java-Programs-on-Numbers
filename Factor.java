package TestPK;

import java.util.*;
public class Factor
{

	public static void main(String[] args) 
	{
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a Number: ");
	int n = sc.nextInt();
	
	double fact=1;
	
	for(int i=n; i>1; i--)
	{
		fact = fact*i; 
	}

	System.out.print("Factorial of a number is " +fact);
	


}
}