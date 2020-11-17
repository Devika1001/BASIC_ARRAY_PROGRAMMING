package com.firstprogram.abc;

import java.util.Scanner;

public class LowerTringularMatrix {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	   	 System.out.println("enter the row value");
	   	 int i=scan.nextInt();
	   	 System.out.println("enter colmn value");
	   	 int j=scan.nextInt();
	   	 System.out.println("enter array elements");
		     int a[][]=new int[i][j];
		     for(i=0;i<=a.length-1;++i)
		     {
		    	 for(j=0;j<=a[i].length-1;++j)
		    	 {
		    		 a[i][j]=scan.nextInt();
		    	 }
		     }
		     System.out.println("array of array is or regular matrix  is");
		     for(i=0;i<=a.length-1;++i)
		     {
		    	 for(j=0;j<=a[i].length-1;++j)
		    	 {
		    	 System.out.print(a[i][j]+"\t");
		    	 }System.out.println();
		     }
		     
		System.out.println("lower tringular matrix");
		 for( i=0;i<=a.length-1;++i)
	     {
	    	 for( j=0;j<=a[i].length-1;++j)
	    	 {
		if(i>j)
		{
			System.out.print(a[i][j]+"\t");
		}
		else
		{
			System.out.print(0+"\t");
		}
		
	       }System.out.println();
	     }
	}

	public static void diagonalElementsMatrix()
	{
      System.out.println("diagonal elements of array");
		 Scanner scan= new Scanner(System.in);
	   	 System.out.println("enter the row value");
	   	 int i=scan.nextInt();
	   	 System.out.println("enter colmn value");
	   	 int j=scan.nextInt();
	   	 System.out.println("enter array elements");
		     int a[][]=new int[i][j];
		     for(i=0;i<=a.length-1;++i)
		     {
		    	 for(j=0;j<=a[i].length-1;++j)
		    	 {
		    		 a[i][j]=scan.nextInt();
		    	 }
		     }
		     System.out.println("array of array is or regular matrix  is");
		     for(i=0;i<=a.length-1;++i)
		     {
		    	 for(j=0;j<=a[i].length-1;++j)
		    	 {
		    	 System.out.print(a[i][j]+"\t");
		    	 }System.out.println();
		     }
		     
		System.out.println("diagonal elements of array");
		 for( i=0;i<=a.length-1;++i)
	     {
	    	 for( j=0;j<=a[i].length-1;++j)
	    	 {
		         if(i!=j)
		       {
			        System.out.print("");
		       }
		         else
		      {
			       System.out.print(a[i][j]+"\t");
		      }
	        }System.out.print("\t");
	     }

	}

}
