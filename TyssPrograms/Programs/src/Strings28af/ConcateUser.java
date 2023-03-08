package Strings28af;

import java.util.Scanner;

public class ConcateUser {
//	"Create a java program to create two String variables
//	read the input from the user and concatenate them "
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter two String");
		String s1=scn.next();
		String s2=scn.next();
		System.out.println(s1.concat(s2));
	}

}
