package com.Anudip;

public class ArrayReverse1D
{

	public static void main(String[] args)
	{
		int a[] = {7,3,5,9};
		int b[] = {6,8,2,5};
		int c[] = new int[a.length];
		
	    System.out.println("\n content of Array a is: ");
		for(int i=0 ; i<a.length ; i++)
		{
			System.out.println(a[i]+ " ");
		}
	        System.out.println("\n content of Array b is: ");
		for(int i=0 ; i<a.length ; i++)
	      
		{
           System.out.println(b[i]+ " ");
		}
		System.out.println("\n content of Array c is: ");
		for(int i=a.length-1 ; i>=0; i--)
		{
			c[i] = a[i] + b[i];
			System.out.println(c[i]+ " ");
		}
		
	}
}

