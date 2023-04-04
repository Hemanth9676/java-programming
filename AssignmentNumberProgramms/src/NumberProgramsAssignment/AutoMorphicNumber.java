package NumberProgramsAssignment;

import java.util.Scanner;

public class AutoMorphicNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	      System.out.println("Enter a Number");
	      int n=scn.nextInt();
	      int sq=n*n;
	      boolean flag=true;
	      while(n>0)
	      {
	    	  if(n%10==sq%10) {
	    		  n/=10;
	    		  sq/=10;
	    	  }
	    	  else
	    	  {
	    		  flag=false;
	    		  break;
	    	  }
	      }
	      if(flag)
	      {
	    	  System.out.println("It is a AutoMorphic Number");
	      }
	      else
	      {
	    	  System.out.println("It is  Not a AutoMorphic Number");
	      
	      }
	}

}
