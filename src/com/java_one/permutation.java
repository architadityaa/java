package com.java_one;

public class permutation {
	
	public static String swapString(String a,int i, int j)
	{
		char[] b=a.toCharArray();
		char ch;
		ch=b[i];
		b[i]=b[j];
		b[j]=ch;
		
		return String.valueOf(b);
	}

	public static void main(String[] args) {
		String str="ABC";
		int len=str.length();
		System.out.println("printing all the sring");
		generate(str,0,len);
		
		// TODO Auto-generated method stub

	}
	public static void generate(String str,int start,int end)
	{
		if(start==end-1)
		{
			System.out.println(str);
		}
		else
		{
			for(int i=start;i<end;i++)
			{
				str=swapString(str,start,end);
				generate(str,start+1,end);
				str=swapString(str,start,i);
			}
		}
	}

}
