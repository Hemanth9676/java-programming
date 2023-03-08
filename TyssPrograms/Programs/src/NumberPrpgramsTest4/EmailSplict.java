package NumberPrpgramsTest4;

import java.util.Arrays;
import java.util.Scanner;

public class EmailSplict {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Email");
		String s=scn.next();
		 String abc="@gmail.com";
     String[] s1=s.split("@");
     System.out.println(Arrays.toString(s1));
     for(int i=0;i<s1.length;i++)
     {
    	 System.out.println(s1[i]);
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
}