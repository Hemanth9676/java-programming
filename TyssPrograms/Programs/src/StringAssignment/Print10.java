package StringAssignment;

import java.util.Scanner;

public class Print10 {

	public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter a String");
     String s=scn.next();
     for(int i=1;i<=s.length();i++)
     {
    	 System.out.println(s);
     }
     
	}

}
