package StringAssignment;

import java.util.Scanner;

public class Print1standLastcharbyComma2 {

	public static void main(String[] args) {
		      Scanner scn=new Scanner(System.in);
		      System.out.println("Enter a String");
		      String s1=scn.next();
		      System.out.println(s1.charAt(0)+","+s1.charAt(s1.length()-1));
	}

}
