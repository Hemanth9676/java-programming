package Programms;

import java.util.Arrays;

public class Printarray {

	public static void main(String[] args) {
//print array in 5 different ways .
		String [] str= {"Robo","Chitti","Chinnu"};
		
		//using for loop 1 way.
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		System.out.println("----------------------------");
		//using for each loop.
	for(String s:str)
	{
		System.out.println(s);
	}
	System.out.println("----------------------------");
	
	//using Arrays.toString Method.
	System.out.println(Arrays.toString(str));
	System.out.println(Arrays.deepToString(str));
	System.out.println("----------------------------");
	
	//using Arrays.asList Method.
	System.out.println(Arrays.asList(str));
	
	}

}
