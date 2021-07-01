package TestPK;

import java.util.*;
public class Sum_of_Natural_no 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		int sum=0;
		for(int i=1; i<=num; i++)
		
		{
		
		 sum = sum+ i;
		}
		System.out.println("The sum of natural number is=" +sum);
		
}

}

