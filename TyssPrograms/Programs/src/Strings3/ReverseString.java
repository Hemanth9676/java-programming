package Strings3;

import java.util.Scanner;

public class ReverseString {

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
	      boolean flg=true;
	     
			if(s1.equals(rev)) 
			{
				System.out.println("  is pallindrome ");
			}
			else
			{
				System.out.println("Not Pallindrome");
			}
				
		}
	}


