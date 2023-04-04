package NumberProgramsAssignment;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter a Number");
     int n=scn.nextInt();
     int sum=0;
     for(int i=1;i<n;i++)
     {
    	 if(n%i==0)
    	 {
    		 sum+=i;
    	 }
     }
     if(sum==n)
     {
    	 System.out.println("It is a Perfect Number");
     }
     else
     {
    	 System.out.println("Not a Perfect Number");
     }
	}

}
