package NumberProgramsAssignment;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter a Number");
     int n=scn.nextInt();
     boolean flag=true;
     if(n<=1)
     {
    	 System.out.println("Not a Prime Number");
    	 
     }
     else
     {
    	 for(int i=2;i<n;i++)
    	 {
    		 if(n%i==0)
    		 {
    			 flag=false;
    			 break;
    			 
    		 }
    	 }
    	 if(flag==true)
    	 {
    		 System.out.println("Prime Number");
    	 }
    	 else
    	 {
    		 System.out.println("Not a Prime Number");
    	 }
     }
	}

}
