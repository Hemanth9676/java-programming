package Strings28af;

import java.util.Scanner;

public class PartOfData {
	//	 Create a variable and take input from the user.Print 
	//	 only part of the data."
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scn.next();
		String[] a=s.split(" ");
		
		for(String n:a) System.out.println(n);
	}

}
