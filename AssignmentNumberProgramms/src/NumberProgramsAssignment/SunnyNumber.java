package NumberProgramsAssignment;

import java.util.Scanner;

public class SunnyNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	      System.out.println("Enter a Number");
	      int n=scn.nextInt();
	      int sum=n+1;
	      boolean flag=true;
	      for(int i=1;i<=n/2;i++)
	      {
	    	  if(i*i==sum)
	    	  {
	    		 flag=false;
	    		 break;
	    	  }
	      }
	      if(flag==false)
	      {
	    	  System.out.println(n+" Sunny Number");
	      }
	      else
	      {
	    	  System.out.println(n+" Not Sunny Number");
	      }
	}

}
