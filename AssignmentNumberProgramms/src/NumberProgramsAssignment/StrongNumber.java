package NumberProgramsAssignment;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter a Number");
     int n=scn.nextInt();
     int temp=n;
     int sum=0;
     while(n>0)
     {
    	 int rem=n%10;
    	 int fact=1;
    	 for(int i=1;i<=rem;i++)
    	 {
    		 fact=fact*i;
    	 }
    	 sum+=fact;
    	 n/=10;
     }
     if(sum==temp)
     {
    	 System.out.println("Strong Number");
     }
     else
     {
    	 System.out.println("Not Strong Number");
     }
	}

}
