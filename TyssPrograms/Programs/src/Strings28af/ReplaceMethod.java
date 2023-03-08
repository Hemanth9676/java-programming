package Strings28af;

import java.util.Scanner;

public class ReplaceMethod {
//	Take a string from user and replace a particular character given by user
	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number");
		String s=scn.next();
		System.out.println(s.replace('j', 'M'));

	}

}
