package my;

import java.util.Scanner;

public class Add 
{
	public static void main(String args[])
	{
		int a,b,c;
		System.out.println("Enter two integers");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=a+b;
		System.out.println("total sum of integers value= "+c);
		
	}
	

}
