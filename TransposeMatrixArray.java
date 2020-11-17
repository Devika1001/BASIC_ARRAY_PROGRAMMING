package com.firstprogram.abc;

import java.util.Scanner;

public class TransposeMatrixArray {

	public static void main(String[] args) {
		System.out.println("printing original array");
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
		System.out.print("transport matrix");
		int b[][]=new int[j][i];
		for(j=0;j<=b.length-1;++j) 
		{
			for(i=0;i<=b[j].length-1;++i)
			{
		         b[j][i]=a[i][j];
		    }System.out.println();
		}
		for(j=0;j<=b.length-1;++j) 
		{
			for(i=0;i<=b[j].length-1;++i)
			{
				System.out.print(b[j][i]+"\t");
		    }System.out.println();
		}
		
		
	}

	}


