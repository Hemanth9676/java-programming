package Strings28af;

import java.util.Scanner;

public class StringLengthUser {
//	"Write a java program to create a String variable ,read 
//	the input from the user and print the String length."
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s1=scn.next();
		System.out.println(s1.length());
	}

}
