package StringAssignment;

import java.util.Scanner;

public class CountNumberOfCharInString4 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number");
		String s=scn.next();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			count++;
		}
		System.out.println(count);
	}

}
