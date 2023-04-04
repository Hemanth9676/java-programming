package NumberProgramsAssignment;

import java.util.Scanner;

public class SumOfFactors {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
	      System.out.println("Enter a Number");
	      int n=scn.nextInt();
	      int sum=0;
	      for(int i=1;i<=n;i++)
	      {
	    	  if(n%i==0)
	    	  {
	    		  sum+=i;
	    	  }
	      }
	      System.out.println(sum+" Total Sum Of Factors");
	}

}
