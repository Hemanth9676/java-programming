package StringAssignment;

import java.util.Scanner;

public class PrintChar7 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scn.next();
		for(int i=0;i<s.length();i++) {
			if(i%2==0)
			{
				if(i==s.length()-1  || i==s.length()-2)

					System.out.print(s.charAt(i));

				else
				{
					System.out.print(s.charAt(i)+",");
				}
			}
		}
	}

}
