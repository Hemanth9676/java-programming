package StringAssignment;

import java.util.Scanner;

public class PositionOfTheLetter3 {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a String");
       String s=scn.next();
       for(int i=0;i<s.length();i++)
       {
    	   if(s.charAt(i)=='a')
    	   {
    		   System.out.println(i+1);
    	   }
       }
	}

}
