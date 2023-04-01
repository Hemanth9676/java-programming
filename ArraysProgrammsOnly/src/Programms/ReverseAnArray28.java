package Programms;

import java.util.Scanner;

public class ReverseAnArray28 {

	public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int n=scn.nextInt();
    int[] n1=new int [n];
    System.out.println("Enter the elements");
    for(int i=0;i<n;i++)
    {
    	n1[i]=scn.nextInt();
    }
    for(int i=n1.length-1;i>=0;i--)
    {
    	System.out.println(n1[i]);
    }
	}

}
