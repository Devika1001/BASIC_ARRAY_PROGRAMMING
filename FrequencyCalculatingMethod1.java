package com.firstprogram.abc;

public class FrequencyCalculatingMethod1 
{

	public static void main(String[] args)
	{
      int a[]= {99,98,98,99,96,99,100,99,100,99,96};
      int res[]=new int[101];
      for(int i=0;i<=a.length-1;++i) 
      
    	  {
    		  res[a[i]]++;
    	  }
    	  for(int k=0;k<=res.length-1;++k)
    	  {
    		  if(res[k]!=0)
    		  {
    			  System.out.println("frequency\t"+k+"\t"+res[k]);
    		  }
    	  }
      
	}

}
