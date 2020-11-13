package com.firstprogram.abc;

public class FindingLeaderElement 
{
	public static void main(String[] args)
	 {
		int i,j=0;
        int a[]= {20,40,80,40,70,59,30};
        for(i=0;i<=a.length-1;++i)
        	{
        	for(j=i+1;j<a.length;++j)
        	{
        		if(a[i]>a[j])
        		{
        			continue;
        		}
        		else
        			{
            			break;
        			}
        	
        	}
        	if(j==a.length)
        System.out.println("leader\t"+a[i]); 		
        	} 
	}

}
