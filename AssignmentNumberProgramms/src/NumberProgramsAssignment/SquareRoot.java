package NumberProgramsAssignment;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter a Number");
      int n=scn.nextInt();
      boolean flag=false;
      int i;
      for( i=1;i<=n;i++)
      {
    	  if(i*i==n)
    	  {
    		  flag=true;
    		  break;
    	  }
      }
      if(flag==true)
      {
    	  System.out.println(i+" It is a Perfect Square");
      }
      }
	

}
