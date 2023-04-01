package Programms;

import java.util.Scanner;

public class SumOfElementsArray28 {

	public static void main(String[] args) {
//Sum Of Elements in Array
		int sum=0;
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n=scn.nextInt();
		int [] a=new int[n];
		System.out.println("Enter the elements ");
		for(int i=0;i<n;i++)
		{
			a[i]=scn.nextInt();
		}
			for(int i:a)
		{
			sum+=i;
		}
		System.out.println(sum);
	}

}
