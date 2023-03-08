package StringAssignment;

import java.util.Scanner;

public class UpperCount {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scn.next();
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			count++;
		}
		System.out.println(count);
	}

}
