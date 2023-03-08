package ArraysTest2;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter a Number");
      int n=scn.nextInt();
      int [] a= {10,20,30,40,50};
      boolean flag=true;
      for(int i=0;i<=a.length-1;i++)
      {
    	  if(a[i]==n)
    	  {
    		  System.out.println(n+" matched the element");
                    flag=false;
                    break;
    	 
      }
	}
      if(flag)
      {
    	  System.out.println(n+" not matched element");
      }
	}
}
