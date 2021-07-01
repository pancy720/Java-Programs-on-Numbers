package TestPK;

import java.util.*;
public class Greates_Comman_Factor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two Number: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int gdc = findGCD(a,b);
		System.out.println("GDC of " +a+ " and " +b+ " is " +gdc);
	}

	static int findGCD(int x, int y)
	{
		int r=0,a,b;
		a = (x>y) ? x:y; // a is greater
		b= (x<y) ? x:y; // b is smaller
					
		while(a%b != 0)
		{
			r = a%b;
			a=b;
			b=r;
		}
		return r;
	}
}

