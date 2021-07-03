package com.java_one;
import java.util.*;
public class str1str2 {
	
	public static boolean checkString(String s1,String s2)
	{
		if(s1.length()!=s2.length())
			{return false;}
		String s3=s1+s1;
		if(s3.contains(s2))
			return true;
		else
			return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="avajava";
		String s2="javaava";
		System.out.println("Check if both are rotation");
		if(checkString(s1,s2))
		{
			System.out.println("yes ");
		}
		else {
			System.out.println("No");
		}
		
	}

}
