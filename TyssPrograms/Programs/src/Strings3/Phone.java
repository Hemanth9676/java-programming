package Strings3;

import java.util.Scanner;

public class Phone {

	public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      System.out.println("Enter a number");
      String s=scn.next();
      System.out.println(s.substring(0,4).concat("******"));
      System.out.println("---------------------------------");
      
      System.out.println(s.substring(0,4)+"******");
      System.out.println("---------------------------------");
      
      System.out.print(s.substring(0,4));
      System.out.print("******");
	}

}
