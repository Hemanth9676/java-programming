package StringAssignment;

import java.util.Scanner;

public class AsciiValuePrint {

	public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter a String");
      String s=scn.next();
      int count=0;
      
      for(int i=0;i<s.length();i++)
      {
    	  int a=s.charAt(i);
    	  System.out.print(a+" ");
    	 if(a%2==0)
    	 {
    		 count++;
    	 }
      }
      System.out.println();
      System.out.println(count);
	}

}
