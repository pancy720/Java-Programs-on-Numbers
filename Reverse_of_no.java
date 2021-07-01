package TestPK;

import java.util.*;
public class Reverse_of_no
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		 int rev =0;
		 while(n !=0)
		 {
			int rem = n % 10;
			rev = (rev *10 )+ rem;
			n = n/10;
		 }
		 {
		
			System.out.println("Reverse of a Number is: " +rev);
		 }
		
	}

}

/* Using Recursion
  import java.util.*; 	
 public class Reverse_Number 
	{  
	//method for reverse a number  
	public static void reverseNumber(int num)   
	{  
	if (num < 10)   
	{  
	//prints the same number if the number is less than 10  
	System.out.println(num);  
	return;  
	}  
	else   
	{  
	System.out.print(num % 10);  
	reverseNumber(num/10);  
	}  
	}  
	public static void main(String args[])  
	{  
	System.out.print("Enter the number that you want to reverse: ");  
	Scanner sc = new Scanner(System.in);  
	int num = sc.nextInt();  
	System.out.print("The reverse of the given number is: ");  
	//method calling  
	reverseNumber(num);  
	}  
	}  
	}

}*/
