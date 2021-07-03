package com.java_one;
import java.util.*;

public class remove_duplic {
	static void duplicate(char[] str,int length)
	{
		int index=0;
		for(int i=0;i<length;i++)
		{
			int j;
			for( j=0;j<i;j++)
			{
				if(str[i]==str[j])
				{
					break;
				}
			}
			if(j==i)
			{
				str[index++]=str[i];
			}
			System.out.println(String.valueOf(Arrays.copyOf(str, index)));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String info="javaTpoint is the best learning website";
		char str[]=info.toCharArray();
		int len=str.length;
		duplicate(str,len);
		

	}

}
