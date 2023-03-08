package StringAssignment;

import java.util.Scanner;

public class EvenAsciiPrint4 {

	public static void main(String[] args) {
		String s="Hello Good Morning all of you";
     int count=0;
     char ch=s.charAt(0);
     
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			count++;
		}
		
		for( int i=1;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				char c2=s.charAt(i+1);
			
				if(c2=='a'||c2=='e'||c2=='i'||c2=='o'||c2=='u')
			   {
				
					count++;
				}
			}
		}
			System.out.println(count);
			
	}
		
	}


