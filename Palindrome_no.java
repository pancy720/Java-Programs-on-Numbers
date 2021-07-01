package TestPK;
import java.util.*; 
public class Palindrome_no {

	 public static void main(String args[])
	 {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a number: ");
	int n = sc.nextInt();
	int temp = n;
	int rev =0;
	while(n != 0)
	{
		int rem = n% 10;
	rev = (rev*10)+ rem;
	n = n/10;
	
	}
	 
	 if(temp == rev)
	 
		 System.out.println("Number is Palindrome");
	 
	 else
	 
		 System.out.println("Number is Not Palindrome");
	 

}
}

