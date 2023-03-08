package Strings3;

import java.util.Scanner;

public class VowelConsonats {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scn.next();
		char[] a=s.toCharArray();
		char c1='a',c2='e',c3='i',c4='o',c5='u';
		
		for(int i=0;i<=a.length-1;i++)
		{
			if(a[i]==c1 || a[i]==c2 || a[i]==c3 || a[i]==c4 || a[i]==c5)
			{
				System.out.println(a[i]+" is Vowel");
			}
			else
			{
				System.out.println(a[i]+" is consonats");
			}
		}
		
	}

}
