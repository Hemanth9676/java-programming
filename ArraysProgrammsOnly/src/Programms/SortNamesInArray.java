package Programms;

import java.util.Scanner;

public class SortNamesInArray {
//WAJP To Sorted names in array.
	public static void main(String[] args) {
     Scanner scn=new Scanner(System.in);
     System.out.println("Enter a Size of names");
      int size=scn.nextInt();
     String[] n=new String[size];
     System.out.println("Enter a Names");
     String temp;
     for(int i=0;i<size;i++)
     {
    	 n[i]=scn.next();
     }
     for(int i=0;i<size;i++)
     {
    	 for(int j=i+1;j<size;j++)
    	 {
    		 if(n[i].compareTo(n[j])>0)
    		 {
    			  temp=n[i];
    			 n[i]=n[j];
    			 n[j]=temp;
    			 
    		 }
    	 }
     }
     for(String name:n)
     {
    	 System.out.println("Sorted names ="+ name);
     }
	}

}
