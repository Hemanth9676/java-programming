package NumberPrpgramsTest4;

import java.util.Scanner;

public class EmailValidation {

	public static void main(String[] args) {
    Scanner scn=new Scanner(System.in);
    System.out.println("Enter a Email");
    String s=scn.next();
    String abc="@gmail.com";
//	String mail = null;
	if(s.contains(abc))
	{
		if(s.equals(abc))
		{
			System.out.println("enter valdid gmail");
		}
		else {
		System.out.println("valied mail");
	}
		}
	else
	{
		System.out.println("enter valied mail");
	}
   
	}
}
