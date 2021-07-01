package TestPK;

import java.util.*;
class Greatest_no_of_two {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a First number: ");
		int num1 = sc.nextInt();
		System.out.print("Enter a Second number: ");
		int num2 = sc.nextInt();
		
		if(num1 > num2)
			System.out.println("Num1 is Greatest");
		else
			System.out.println("Num2 is Greatest");

	}

}
