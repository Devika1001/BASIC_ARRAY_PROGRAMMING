package com.firstprogram.abc;

import java.util.Scanner;

public class UnitMatrixCheck {

	public static void main(String[] args) {
		System.out.println("check wether the given matrix is unit matrix or identity matrix");
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
		     
		System.out.println("checking the matrix is unit matrix or not");

		 for( i=0;i<=a.length-1;++i)
	     { 
	    	 for( j=0;j<=a[i].length-1;++j)
	    	 {
		         if(i==j&&a[i][j]!=1)
		            {
		        	 System.out.println("it is not  unit matrix");
	        		 System.exit(0);
		            }
		         else if(i!=j&&a[i][j]!=0)
		        	 { System.out.println("it is not  unit matrix");
		        		 System.exit(0);
		        	 }
	        }
	     }
		 
       	 System.out.println("its is unit matrix");
       	 System.exit(0);
        

	}

}
