package StringAssignment;

import java.util.Scanner;

public class ConvertUpperCase {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=scn.next();

		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='a' && s1.charAt(i)<='z')

			{
				s2+=(char)(s1.charAt(i)-32);
			}
		}
		System.out.println(s2);
	}

}