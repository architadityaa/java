package com.java_one;

public class nonrepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="gibblegabbler";
		System.out.println("the given string is"+s1);
		for(int i=0;i<s1.length();i++)
		{
			boolean unique=true;
			for(int j=0;j<s1.length();j++)
			{
				if(i!=j && s1.charAt(i)==s1.charAt(j))
					{unique=false;
				    break;
					}
			}
		
		if(unique)
		{
			System.out.println("the first "+s1.charAt(i));
			break;
		}
		}

	}

}
