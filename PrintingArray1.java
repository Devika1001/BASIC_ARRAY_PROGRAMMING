package com.firstprogram.abc;

import java.util.Scanner;

public class PrintingArray1 
{

	public static void main(String[] args)
	{
		 
			System.out.println("printing 2d array");
			Scanner scan= new Scanner(System.in);
			
			System.out.println("enter row value");
			int i=scan.nextInt();
			
			System.out.println("enter column value");
			int j=scan.nextInt();
			
			
			int a[][]=new int[i][j];
			System.out.println("enter array elements");
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
		}	

}
