//Author: Thomas George Thomas
//Check if number given is prime

import java.util.*;

public class checkIfPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check for prime: ");		
		int n=sc.nextInt();
		int flag=0;
		
		if(n==0||n==1)
			System.out.print("Not Prime");
		else
		{
			for(int i=2;i<(n/2);i++)
			{
				if(n%i==0)
				{
					System.out.print("Not Prime");
					flag=1;
					break;
				}
			}
			if(flag==0) System.out.print("Is Prime");
		}
	}

}
