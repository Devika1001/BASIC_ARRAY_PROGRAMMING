package com.firstprogram.abc;
import java.util.*;

interface Matrix
{
	public void upprerTringularMatrix();
	public void lowerTringularMatrix();
	public void diagonalElementsMatrix();
	public void sumOfDiagonalElementOfMatrix();
	public void checkUnitMatrix();
	public void rightDiagonalElement();
	public void sumOfrightDiagonalElement();
	
}


 class Array2DMatrix
{
	 
	 
	 public static void main(String[] args)
		{
		 Array2DMatrix a=new Array2DMatrix();
	     a.printingMatrix();
			MethodMatrix1 mt=new MethodMatrix1();
			mt.upprerTringularMatrix1(printingMatrix());
		}
			
	 
	public static int a[][];
	public static void printingMatrix()
	{
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
	     
	}
	}
		
 class MethodMatrix extends ArrayForCheck implements Matrix
{
	public   void upprerTringularMatrix()
	{
		 for(int i=0;i<=a.length-1;++i)
	     {
	    	 for(int j=0;j<=a[i].length-1;++j)
	    	 {
		if(i<=j)
		{
			System.out.print(a[i][j]);
		}
		else
		{
			System.out.print(0);
		}
		
	}
	     }
	}

	@Override
	public void lowerTringularMatrix() 
	{
		 for(int i=0;i<=a.length-1;++i)
	     {
	    	 for(int j=0;j<=a[i].length-1;++j)
	    	 {
		if(i>=j)
		{
			System.out.print(a[i][j]);
		}
		else
		{
			System.out.print(0);
		}
		
	}
	     }
	}

	@Override
	public void diagonalElementsMatrix()
	{
		 for(int i=0;i<=a.length-1;++i)
	     {
	    	 for(int j=0;j<=a[i].length-1;++j)
	    	 {
		         if(i!=j)
		       {
			        System.out.print(0);
		       }
		         else
		      {
			       System.out.print(a[i][j]);
		      }
	        }
	     }
	}

	@Override
	public void sumOfDiagonalElementOfMatrix() 
	{
		 for(int i=0;i<=a.length-1;++i)
	     { int sum=0;
	    	 for(int j=0;j<=a[i].length-1;++j)
	    	 {
		         if(i!=j)
		       {
			        System.out.print(0);
		       }
		         else
		      {
			       System.out.print(a[i][j]);
			       sum+=a[i][j];
		      }
	        }
	     }
		
	}

	@Override
	public void checkUnitMatrix() 
	{

		 for(int i=0;i<=a.length-1;++i)
	     { 
	    	 for(int j=0;j<=a[i].length-1;++j)
	    	 {
		         if(i==j&&i==1)
		       {
		        	 if(i!=j&&i==0)
		        	 {
		        		 System.out.println("it is unit matrix");
		        	 }
		        	 else
		        	 {
		        		 System.exit(0);
		        	 }
		       }
		         else
		         {
		        	 System.exit(0);
		         }
		        
		      
	        }
	     }
	}

	@Override
	public void rightDiagonalElement()
	{
		 for(int i=a.length-1;i>0;--i)
	     {
	    	 for(int j=a.length-1;j>0;--j)
	    	 {
		         if(i!=j)
		       {
			        System.out.print(0);
		       }
		         else
		      {
			       System.out.print(a[j][i]);
		      }
	        }
	     }
		
	}

	@Override
	public void sumOfrightDiagonalElement() 
	{
		int sum=0;
		 for(int i=a.length-1;i>0;--i)
	     {
	    	 for(int j=a.length-1;j>0;--j)
	    	 {
		         if(i!=j)
		       {
			        System.out.print(0);
		       }
		         else
		      {
			       System.out.print(a[j][i]);
			       sum+=a[j][i];
		      }
	        }
	     }

		
	}
	
}