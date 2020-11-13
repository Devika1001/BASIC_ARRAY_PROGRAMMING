package com.firstprogram.abc;

public class DuplicateNumberMethod1 
{

	public static void main(String[] args) 
	{
        int a[]= {99,98,99,98,99,98,96,97};
        int res[]=new int[100];
        for(int i=0;i<=a.length-1;++i)
	   {
       res[a[i]]++; 	
        }
        for(int j=0;j<=res.length-1;++j)
        {
        if(res[j]>1)
          {
        	System.out.print(j+"\t");
          }
	    }
	}
}
