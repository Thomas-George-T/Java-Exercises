//Author : Thomas George Thomas
// Find the the fibonacci series up to term t using recursion
import java.util.Scanner;

public class fiboRecursive {
	
	static int n1=0,n2=1,n3=0;
	static void printRecursiveFibo(int t)
	{
		if(t>0)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			printRecursiveFibo(t-1);
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the term up to which fibonacci series is to be calculated: ");
		int t=sc.nextInt();
		
		if(t==1 || t==0)
			System.out.println(0);
		else
		{
			System.out.print(0+" "+1);
			printRecursiveFibo(t-2);
		}
	}
}
