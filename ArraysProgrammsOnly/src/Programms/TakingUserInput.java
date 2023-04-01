package Programms;

import java.util.Scanner;

public class TakingUserInput {
	//Write a java Program create an array taking input from user.
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Size of Array");
		int size=scn.nextInt();

		int[] a=new int[size];
		System.out.println("Enter The Elements");
		for(int i=0;i<size;i++)
		{
			a[i]=scn.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
