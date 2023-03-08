package Array2d27;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Key");
		int key=scn.nextInt();
       int [] a= {10,20,30,40,50,60};
       int low=0,high=a.length-1;
       boolean flag=false;
       while(low<=high)
       {
    	   int mid=(low+high)/2;
    	   if(key==a[mid])
    	   {
    		  flag=true;
    		   break;
    	   }
    	   else if(key>a[mid])
    	   {
    		   low=mid+1;
    		   high=high;
    	   }
    	   else
    	   {
    		   high=mid-1;
    		   low=low;
    	   }
    	  
       }
       if(flag)
       {
    	   System.out.println("Key is Present at Index");
       }
       else
       {
    	   System.out.println("Key is  Not Present at Index");
       }
     
       
	}

}
