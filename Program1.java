package Shimakh;

import java.util.Scanner;

public class Program1 
{
	public static void add(double a, double b)
	{
		double res=a+b;
		System.out.println("the addition of "+a+" + "+b+" = "+res);
	}
	public static void sub(double a, double b)
	{
		double res=a-b;
		System.out.println("the subtraction of "+a+" + "+b+" = "+res);	
	}
	public static void mul(double a, double b)
	{
		double res=a*b;
		System.out.println("the multiplication of "+a+" + "+b+" = "+res);
	}
	public static void div(double a, double b)
		{
		double res=a/b;
		System.out.println("the division of "+a+" + "+b+" = "+res);
		}

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	double a;
	double b;
	String operation;
	
	while(true)
	{
		System.out.println("enter the value a");
		a=sc.nextInt();
		System.out.println("enter the value b");
		b=sc.nextInt();
		System.out.println("enter the operator");
		operation=sc.next();
		switch(operation)
		{
		case "+":add(a,b);
		break;
		case "-":sub(a,b);
		break;
		case "*":mul(a,b);
		break;
		case "/":div(a,b);
		break;
		default:System.out.println("invalid");
		}
	}
	}



}
