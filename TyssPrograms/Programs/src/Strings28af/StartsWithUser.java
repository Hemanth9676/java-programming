package Strings28af;

import java.util.Scanner;

public class StartsWithUser {
//	"Write a java program to create a String variable, read
//	the input from the user and print true if the word starts
//	with letter 'H'"
	public static void main(String[] args) {
         Scanner scn=new Scanner(System.in);
         System.out.println("Enter a String");
         String s=scn.next();
         System.out.println(s.startsWith("H"));
	}

}
