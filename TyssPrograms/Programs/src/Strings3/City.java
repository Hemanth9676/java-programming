package Strings3;

import java.util.Scanner;

public class City {
//Printing the city name last 4 digits
	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a City");
       String s=scn.next();
       System.out.println(s.substring(s.length()-4));
	}

}
