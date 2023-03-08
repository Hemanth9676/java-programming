package Strings28af;

import java.util.Arrays;
import java.util.Scanner;

public class SplitSeparate {
//	"Write a program to create a String ""Test Yantra"" and seperate both 
//	words"
	public static void main(String[] args) {
		String s="Test Yantra";
		String[] a=s.split(" ");
		
		for(String n:a) System.out.println(n);
		System.out.println("*****************************");
		String s1="java is an oop lang";
		String[] a1=s1.split(" ");
		
		for(String n:a1) System.out.println(n);
		
		System.out.println("*****************************");
		
		String s2="Bangalorte  chennai  Gova";
		String[] a2=s2.split(" ");
		
		for(String n:a2) System.out.println(n);
		
		

		

	}

}
