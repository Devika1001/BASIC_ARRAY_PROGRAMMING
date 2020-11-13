package com.firstprogram.abc;
import java.util.Arrays;

public class ArrayCopyProgram 
{

	public static void main(String[] args) 
	{
		int a[]= {40,10,70,90,80,60};
//		copying array
		int a1[]=Arrays.copyOf(a,6);
		for(int i=0;i<=a.length-1;++i)
		{		
		System.out.println(a1[i]+"\t");
		}

//      checking equal
	if(	Arrays.equals(a1, a))
	{
		System.out.println("arrays are equal");
	}
	else
	{
		System.out.println("arrays are not equals");
	}
//		sorting array
	Arrays.sort(a);
	for(int i=0;i<=a.length-1;++i) 
	{
	System.out.println(a[i]+"\t");
	}
//	    binary search
	int index=Arrays.binarySearch(a,90);
	if(index>0)
	{
		System.out.println("search found @"+"\t"+index);
		
	}
	else
	{
		System.out.print("search not found"+index);
	}
		

//	copy up to particular index

	int b[]=Arrays.copyOf(a,4);
		for(int i=0;i<=b.length-1;++i)
		{
		System.out.println(b[i]);
		}
//		SORTED
		Arrays.sort(b);
		for(int i=0;i<=b.length-1;++i)
		{
			System.out.println(b[i]);
		}
		
//		search between index
		int b1=Arrays.binarySearch(b,1,2,10);
		if(b1>0)
		{
			System.out.print("key found"+b1);
		}
		else
		{
			System.out.print("key not found"+b1);
		}
	}
}

