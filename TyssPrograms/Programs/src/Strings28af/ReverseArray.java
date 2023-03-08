package Strings28af;

import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	      System.out.println("Enter a String");
	      String s1=scn.next();
	      String rev ="";
	      for(int i=s1.length()-1;i>=0;i--)
	      {	    	
	        rev+=s1.charAt(i);
	      }
	      System.out.print(rev);
	}

}
