package NumberProgramsAssignment;

import java.util.Scanner;

public class EvenRange {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	      System.out.println("Enter a Number");
	      int n1=scn.nextInt();
//	      int n=028;
	      for(int i=1;i<=n1;i++)
	      {
	    	  if(i%2==0)
	    	  {
	    		 System.out.println(i+" Even"); 
	    	  }
	      }
	}

}
