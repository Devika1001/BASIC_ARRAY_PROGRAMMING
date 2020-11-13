package com.firstprogram.abc;

public class XoringOfTwoNumber {

	public static void main(String[] args) 
	{
        int a[]= {60,70,90,60,80,80,70};
        int res=a[0];
        for(int i=1;i<=a.length-1;++i) 
        {
        	res=res^a[i];
        }
        System.out.print("output\t"+res);
	}

}
