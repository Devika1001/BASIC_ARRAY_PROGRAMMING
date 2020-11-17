package com.firstprogram.abc;

import java.util.Scanner;

public class AddAllElement {

	public static void main(String[] args) {
		System.out.println("sum of two arrays");
		Scanner scan= new Scanner(System.in);
		
		System.out.println("enter row value");
		int i=scan.nextInt();
		
		System.out.println("enter column value");
		int j=scan.nextInt();
		
		
		
		int a[][]=new int[i][j];
		System.out.println("enter a-array elements");
		for( i=0;i<=a.length-1;++i)
		{
			for( j=0;j<=a[i].length-1;++j)
			{
				
				a[i][j]=scan.nextInt();
			}
			
		}
		
		for( i=0;i<=a.length-1;++i)
		{
			for(j=0;j<=a[i].length-1;++j)
			{
				System.out.print((a[i][j]+"\t"));
			}System.out.print("\n");

		}
		
		System.out.println("sum of all elements in array");
		int sum=0;
		for( i=0;i<=a.length-1;++i)
		{
			for(j=0;j<=a[i].length-1;++j)
			{
			sum=sum+a[i][j];
				
			}System.out.print("\n");

		}System.out.println(sum);
		
	}

	}

	


