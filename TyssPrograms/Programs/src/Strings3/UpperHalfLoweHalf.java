package Strings3;

import java.util.Scanner;

public class UpperHalfLoweHalf {

	public static void main(String[] args) {
//     Scanner scn=new Scanner(System.in);
//     System.out.println("Enter a number");
//     String s=scn.next();
//     System.out.print(s.substring(0,3));
//     System.out.print(s.substring(s.length()-4));
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
        String s=sc.next();
        String ss=s.substring(0,s.length()/2);
        String ss1=s.substring(s.length()/2);
        String ls=ss.toLowerCase();
        String up=ss1.toUpperCase();
        System.out.print(ls);
        System.out.print(up);
     
	}

}
