package NumberPrpgramsTest4;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter a Number");
      int n=scn.nextInt();
      int sum=0,orgnum=n;
      while(n>0)
      {
    	  int rem=n%10;
    	  int fact=1;
    	  
      
      for(int i=1;i<=rem;i++)
      {
    	 fact*=i; 
      }
      sum+=fact;
      n/=10;
      }
      if(orgnum==sum)
      {
    	  System.out.println("Strong");
      }
      else
      {
    	  System.out.println("Not Strong");
      }
	}

}
