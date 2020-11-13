package com.firstprogram.abc;

public class Frequencycalculating
{
//hard coded to give input value
	public static void main(String[] args)
	{
		int a[]= {99,98,97,96,98,98,97,96};
		int x=98;
		int count=0;
		for(int i=0;i<=a.length-1;++i) 
		{
			if(a[i]==x)
			{
				++count;
				a[i]=-1;
			}
		}System.out.print("frequency"+x+"\t"+count);

	}

}
