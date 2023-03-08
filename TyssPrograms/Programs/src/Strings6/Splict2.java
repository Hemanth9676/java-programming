package Strings6;

import java.util.Arrays;

public class Splict2 {

	public static void main(String[] args) {
     String s="Hello World Hello World";
     String[] s1=s.split(" ");
     System.out.println(Arrays.toString(s1));
     for(int i=0;i<s1.length;i++)
     {
    	 System.out.println(s1[i]);
     }
	}

}
