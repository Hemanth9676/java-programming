package Strings28;

import java.util.Scanner;

public class IngnoreCaseUser {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	      System.out.println("Enter a String");
	      String s1=scn.next();
	      String s2=scn.next();
	      System.out.println(s1.equalsIgnoreCase(s2));
	}

}
