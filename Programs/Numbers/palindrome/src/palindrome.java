//Author: Thomas George Thomas
//Check if number is a palindrome

import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check for palindrome: ");
		int n=sc.nextInt();
		int r=0,sum=0;
		int copy=n;
		
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n/=10;
		}
		
		if(copy==sum) 
			System.out.println("Palindrome");
		else 
			System.out.println("Not Palindrome");
	}

}
