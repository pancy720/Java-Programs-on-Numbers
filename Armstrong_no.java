package TestPK;

import java.util.Scanner;

public class Armstrong_no {
	 static boolean isArmstrong(int n)
	{
		int temp, digit =0, sum=0;
		temp =n;
		while(temp>0)
		{
			temp = temp/10;
			digit ++;
		}
		temp = n;
		while(temp>0)
		{
		int rem = temp % 10;
		sum += Math.pow(rem, digit);
		temp = temp/10;
		}
		if(sum == n)
		{
			return true;	
		}
		else {
			return false;
		}
		
		
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		boolean check = isArmstrong(num);
		if(check)
		{
		System.out.println("Number is Armstrong.");
		}else
		{
			System.out.println("Number is not Armstrong.");
		}

	}
	}


