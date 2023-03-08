package StringAssignment;

import java.util.Scanner;

public class CovertLower14 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=scn.next();

		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)>='A' && s1.charAt(i)<='Z')

			{
				s2+=(char)(s1.charAt(i)+32);
			}
		}
		System.out.println(s2);
	}

}
