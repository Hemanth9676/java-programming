package NumberPrograms;

import java.util.Scanner;

public class Xylem {

	public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter a number");
     int n=scn.nextInt();
     
     int sumfl=0;
     int sumrest=0;
     sumfl=n%10;
     n/=10;
     
     while(n>9)
     {
    	 sumrest+=n%10;
    	 n/=10;
     }
     sumfl+=n;
     if(sumrest==sumfl)
     {
    	 System.out.println("It is Xylem Number....");
     }
     else
     {
    	 System.out.println("It is a phloem Number...");
     }
     
	}

}
