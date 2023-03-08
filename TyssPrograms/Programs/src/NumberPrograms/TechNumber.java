package NumberPrograms;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter a number");
      int n=scn.nextInt();
      int temp=n;
      int count=0;
      int sq=0;
      int sum=0;
      int d=1;
      while(n>0)
      {
    	  n/=10;
    	  count++;
      }
      System.out.println(count);
      int x = count/2 ;
      System.out.println(x);
      for(int i=1;i<=x;i++)
	  {
		  d = d* 10 ;
		  System.out.println(d);
	  }
	 
      if(count%2==0)
      { 
          n=temp;
    	  //int div=count/2;
    	  
    	  int split1= n%d;
    	  System.out.println(split1);
    	  int split2=n/d;
    	  System.out.println(split2);
    	  
    	  sum=split1+split2;
    	  sq=sum*sum;


          if(sq==n)
          {
        	  
        	  System.out.println("It is a Tech Number");
          }
          
          else {
        	  System.out.println("Not Tech Number");
          }

    	  
      }
      else
      {
    	  System.out.println("Not Tech number");
      }
                 
      
      }
	}

    
      
	


