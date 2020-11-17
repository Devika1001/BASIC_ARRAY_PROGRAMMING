package com.firstprogram.abc;

import java.util.Scanner;

public class AdditionOf2DArray {

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
			
			int b[][]=new int[i][j];
			System.out.println("enter b-array elements");
			for( i=0;i<=b.length-1;++i)
			{
				for( j=0;j<=b[i].length-1;++j)
				{
					
					b[i][j]=scan.nextInt();
				}
				
			}
			
			for( i=0;i<=b.length-1;++i)
			{
				for(j=0;j<=b[i].length-1;++j)
				{
					System.out.print((b[i][j]+"\t"));
				}System.out.print("\n");
				
			}
				int c[][]=new int[i][j];
				System.out.println("printing sum of two array elements");
		
		for( i=0;i<=c.length-1;++i)
		{
			for(j=0;j<=c[i].length-1;++j)
			{
				c[i][j]=a[i][j]+b[i][j];
				
			}
		}
		for( i=0;i<=c.length-1;++i)
		{
			for(j=0;j<=c[i].length-1;++j)
			{
				System.out.print(c[i][j]+"\t");
				
			}System.out.println();
		}
	
}
}
