package SortingMethods;

import java.util.Scanner;

public class InsertingElement {

	public static void main(String[] args) {
       int [] a= {2,3,4,5,6};
       int [] b=new int[a.length+1];
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter Index");
       int index=scn.nextInt();
       System.out.println("Enter a value");
       int ele=scn.nextInt();
       int div=0;
       for(int i=0;i<b.length;i++)
       {
    	   if(i==index)   b[i]=ele;
    	   else
    	   {
    		   b[i]=a[div++];
    				   
    	   }
       }
       for(int n:b)  System.out.println(n);
	}

}
