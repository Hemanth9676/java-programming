package NumberProgramsAssignment;

import java.util.Scanner;

public class TechNumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		int count=0;
		int temp=n;
		int n1=n;
		int a=0;
		while(n!=0)
		{
			count++;
			n/=10;
		}
		
		if(count%2!=0)
		{
			System.out.println("not tech number");
		}
		else
		{
			int fact=1;
			for(int i=1;i<count/2;i++)
			{
				fact*=i;
			}
			
				a=temp%fact;
				temp/=fact;
				int sum=temp+a;
				if(sum==n1)
				{
					System.out.println("tech number");
				}
				else
				{
					System.out.println("not tech number");
				}
			}
			
		}
		
}