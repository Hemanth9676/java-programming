package NumberProgramsAssignment;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter a Number");
     int n=scn.nextInt();
     int sum=0;
     int prod=1;
     while(n>0)
     {
    	 int rem=n%10;
    	 sum+=rem;
    	 prod*=rem;
    	 n/=10;
    	 
     }
     if(sum==prod)
     {
    	 System.out.println("It is Spy Number");
     }
     else
     {
    	 System.out.println("Not Spy Number");
     }
	}

}
