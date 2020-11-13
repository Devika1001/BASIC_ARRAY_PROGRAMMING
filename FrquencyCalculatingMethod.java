package com.firstprogram.abc;

public class FrquencyCalculatingMethod
{

	public static void main(String[] args) 
	{
	
      int a[]= {98,99,97,99,100,98,100,97,100,98};
      
      
       for(int i=0;i<=a.length-1;++i)
         {int count=0;
    	   int x=a[i];
    	   if(x==-1)continue;
    	   for(int j=0;j<=a.length-1;++j)
    	   {
    		   
    		   if(a[j]==x)
    		   {
    			   ++count;
    			   a[j]=-1;
    		   }
    	   }System.out.println("frequency\t"+x+"\t"+count);
	      
         }
	}

}
