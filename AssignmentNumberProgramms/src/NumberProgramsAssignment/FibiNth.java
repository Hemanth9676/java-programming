package NumberProgramsAssignment;

import java.util.Scanner;

public class FibiNth {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	      System.out.println("Enter a Number");
	      int n=scn.nextInt();
	      int a=0,b=1,c;
	      for(int i=1;i<=n;i++)
	      {
	    	  if(i==n)
	    	  {
	    		  System.out.println(a+" is  fibinacci Series ");
	    	  }
	    	  c=a+b;
	    	  a=b;
	    	  b=c;
	      }
	}

}
