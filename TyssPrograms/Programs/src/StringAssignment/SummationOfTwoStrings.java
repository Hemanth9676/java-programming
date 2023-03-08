package StringAssignment;

import java.util.Scanner;

public class SummationOfTwoStrings {

	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
	       System.out.println("Enter a String1");
	       String s1=scn.next();
	       System.out.println("Enter a String2");
	       String s2=scn.next();
	       int sum=s1.length()+s2.length();
	       System.out.println("Summation is "+sum);
	       
	}

}
