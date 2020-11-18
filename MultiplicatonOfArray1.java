package com.firstprogram.abc;

import java.util.Scanner;

public class MultiplicatonOfArray1 {

	public static void main(String[] args) {
		System.out.println("multiplication of two arrays");
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the row value");
		int i=scan.nextInt();
		System.out.println("enter the column value");
		int j=scan.nextInt();
		System.out.println("enter the value of a-array element");
		
		int a[][]=new int[i][j];
		for( i=0;i<=a.length-1;++i)
		{
			for(j=0;j<=a[i].length-1;++j)
			{
				a[i][j]=scan.nextInt();
			}
		}
		
		for( i=0;i<=a.length-1;++i)
		{
			for(j=0;j<=a[i].length-1;++j)
			{
				System.out.print(a[i][j]+"\t");
			}System.out.println();
		}
		
		System.out.println("enter the value of b-array element");
		int b[][]=new int[i][j];
		for( i=0;i<=b.length-1;++i)
		{
			for(j=0;j<=b[i].length-1;++j)
			{
				b[i][j]=scan.nextInt();
			}
		}
		
		for( i=0;i<=b.length-1;++i)
		{
			for(j=0;j<=b[i].length-1;++j)
			{
				System.out.print(b[i][j]+"\t");
			}System.out.println();
		}
		
		
		System.out.println("multiplication of two array");
		int c[][]=new int[i][j];
	
	
		for(i=0;i<=a.length-1;++i) 
		{
			for(j=0;j<=a[i].length-1;++j)
			{
				for(int k=0;k<=b[i].length-1;++k)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
	
				}
				
			}
		}
		
		for(i=0;i<=a.length-1;++i) 
		{
			for(j=0;j<=a[i].length-1;++j)
			{	
				System.out.print(c[i][j]+"\t");
				}System.out.println();
		}
			
		
	}

	}


