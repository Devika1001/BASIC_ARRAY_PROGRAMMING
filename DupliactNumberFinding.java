package com.firstprogram.abc;

public class DupliactNumberFinding
{

	public static void main(String[] args)
	{
        int a[]= {99,98,99,98,97,98,98,97,99,98,96};
        for(int i=0;i<=a.length-1;++i)
        {
        	int x=a[i];  
        	if(x==-1)continue;
        	int count=0;
        	for(int k=0;k<=a.length-1;++k)
        	{
        		if(a[k]==x)
        		{
        			++count;
        			a[k]=-1;
        		}
        	}
       if(count>1)
        {
        	System.out.println("duplicate number\t"+x+"\t"+count);
        }
        
        } 
}
	
}
	
