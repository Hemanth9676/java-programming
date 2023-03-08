package StringAssignment;

import java.util.Scanner;

public class Reverse5 {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a String");
       String s=scn.next();
       String rev="";
       for(int i=s.length()-1;i>=0;i--)
       {
    	   rev+=s.charAt(i);
       }
       System.out.println(rev);
	}

}
