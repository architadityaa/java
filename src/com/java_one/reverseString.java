package com.java_one;
import java.util.*;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="gsab";
		String s2="brag";
		s1.toLowerCase();
		s2.toLowerCase();
		if(s1.length()!=s2.length())
		{
			System.out.println("Strings are not anagram");
		}
		else
		{
			char st1[]=s1.toCharArray();
			char st2[]=s2.toCharArray();
			
			Arrays.sort(st1);
			Arrays.sort(st2);
			
			if(Arrays.equals(st1, st2)==true)
			{
				System.out.println("both are anagram");
			}
			else
			{
				System.out.println("not anagram");
			}
		}
	}

}
