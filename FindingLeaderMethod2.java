package com.firstprogram.abc;

public class FindingLeaderMethod2
{

	public static void main(String[] args)
	{
     int a[]= {1,2,3,5,4,7,96,6,9,8};
     int max=a[a.length-1];
     System.out.println("leader\t"+max);
     for(int i=a.length-2;i>0;i--)
     {
    	 if(a[i]>max)
    	 {
    		 System.out.println("leader\t"+a[i]);
    	
    		 max=a[i];
    	 }
     }
	}

}
