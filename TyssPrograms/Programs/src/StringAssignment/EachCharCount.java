package StringAssignment;

import java.util.Scanner;

public class EachCharCount {

	public static void main(String[] args) {
		String s1="Hello";
		char c;
		String s2;
		while(s1.length()>0)
		{
			c=s1.charAt(0);
			{
				s2=s1.replace(c+"","");
				int count=s1.length()-s2.length();
				System.out.println(c+"="+count);
				s1=s2;
			}
		}


	}

}
