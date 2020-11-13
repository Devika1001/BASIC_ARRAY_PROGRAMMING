package com.firstprogram.abc;
import java.util.Scanner;
public class AddUsingArray
{
	public static void main(String[] args) 
	{ 
		int sum=0,mul=1;
      int a[]= new int[10];
      System.out.println("enter array value");
      Scanner scan= new Scanner(System.in);
      for(int i=0;i<=a.length-1;++i) 
      {
    	   a[i]=scan.nextInt();
    	   sum+=a[i];
      System.out.print(a[i]+"\t");
      }
      System.out.println("\n"+sum);
//     sum of odd number and sum of even number
      int sume=0;
      int sumo=0;
      for(int i=0;i<=a.length-1;++i)
      {
    	  if(a[i]%2==0) 
    	     {
    		  sume+=a[i];
    		  System.out.print(a[i]+"\t");
    		 
    		  }
    	  
    	  else 
    	  {
    		  sumo+=a[i];
    		  System.out.println(a[i]+"\t");
    	  }
      }
      System.out.println(sume);
	  System.out.println(sumo);

    	  for(int k=0;k<=a.length-1;++k)
          {
        	  if(a[k]%2==0) 
        	     {
        		  mul*=a[k];
        		  System.out.print(a[k]+"\t");
        		 
        		  }
    		  
          } 
    	  
    	  System.out.println(mul);
	}
	
}