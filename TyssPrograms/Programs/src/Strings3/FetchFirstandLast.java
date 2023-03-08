package Strings3;

import java.util.Scanner;

public class FetchFirstandLast {

	public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter a Styring");
        String s=scn.next();
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(s.length()-1));
	}

}
