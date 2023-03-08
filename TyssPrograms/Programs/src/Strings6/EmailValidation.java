package Strings6;

import java.util.Arrays;
import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
//     String s="yasarapuhemanth26800@gmail.com";
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Email");
		String s=scn.next();
     String[] s1=s.split("@");
     System.out.println(Arrays.toString(s1));
     boolean flag=true;
     for(int i=0;i<s1.length;i++)
     {
    	 System.out.println(s1[i]);
    	 if(s1[i]=="@gmail.com") {
    		 System.out.println("Valid");
    		 flag=false;
    		 break;
    	 }
    	 else
    	 {    		     		 
    	 }
     }
     if(flag)
     {
    	 System.out.println("Valid");
     }
     else
     {
    	 System.out.println("Not Valid");
     }
     
     
	}

}
