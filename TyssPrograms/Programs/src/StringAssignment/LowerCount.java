  package StringAssignment;

import java.util.Scanner;

public class LowerCount {

	public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter a String");
      String s=scn.next();
      int count=0;
      int sp=0;
      for(int i=0;i<s.length();i++)
      {
    	  if(s.charAt(i)>='a' && s.charAt(i)<='z')
    	  {
    		  count++;
    	  }
    	  else if(s.charAt(i)>='A' && s.charAt(i)<='Z')
    	  {
    		 
    	  }
    	  else if(s.charAt(i)>='0' && s.charAt(i)<='9')
    	  {
    		  
    	  }
    	  else
    	  {
    		  sp++;
    	  }
      }
      System.out.println(count);
      System.out.println(sp);
	}

}
