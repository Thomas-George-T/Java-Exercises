//Author: Thomas George Thomas
// Check for armstrong number

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check for armstrong: ");
		int n=sc.nextInt();
		
		int copy=n,r=0,sum=0;
		
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;			
		}
		if(copy==sum) System.out.println("Armstrong number!");
		else System.out.println("Not Armstrong number");
	}

}
