package Strings6;

import java.util.Arrays;
import java.util.Scanner;

public class SplictEmail2 {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a Email");
       String s=scn.next();
       boolean flag=true;
       if(s!=null && s.contains("@"))
       {
    	   String[] a=s.split("@");
    	   String user=a[0];
    	   String domin=a[1];
    	   if(user!=null && domin!=null)
    	   {
    		   
    		   if(domin.startsWith(".")==false && domin.endsWith(".")==false && domin.endsWith("..")==false)
    		   {
    			 System.out.println("Valid");
    		   }
    		   else
    		   {
    			   System.out.println("not valid");
    		   }
    		   
    	   }
    	   else
           {
        	   System.out.println("Not Valid");
           }
       }
      
      
       
       }
	}


