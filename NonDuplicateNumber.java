package com.firstprogram.abc;

public class NonDuplicateNumber
{

	public static void main(String[] args) 
	{
		int a[]= {99,98,98,99,96,98,99,97,97};
        for(int i=0;i<=a.length-1;++i) 
        {
        	int x=a[i];
        	int count=0;
        	if(x==-1)continue;
        	for(int k=0;k<=a.length-1;++k)
        	{
        		if(a[k]==x)
        		{
        			++count;
        			a[k]=-1;
        		}
        	}
        
        if(count==1)
        {
        	System.out.println("non duplicate number\t"+x+"\t");
        }
	}

}
}