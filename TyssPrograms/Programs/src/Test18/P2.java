package Test18;

import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		 Scanner scn = new Scanner(System.in);
	      System.out.println("Enter a number");
	      int num=scn.nextInt();
	      for(int i=1;i<=num;i++)
	      {
	    	  for(int j=1;j<=num;j++)
	    	  {
	    		  if(i==1 || j==1 && i<=num/2+1 || i==num/2+1||j==num && i>=num/2+1||i==num)
	    		  System.out.print("*");
	    	  
	    	  else
	    	  {
	    		  System.out.print(" ");
	    	  }
	    	  }
	      
	      System.out.println();
	    	  
	      } 
      
	}

}
