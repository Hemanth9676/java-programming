package Programms;

import java.util.Arrays;
//write a java program to find second largest element in the array in the java
public class SecondHighestElement28 {

	public static void main(String[] args) {
     int[] a= {5,10,3,8,2,9,1,0};
     Arrays.sort(a);
     System.out.println("Second Highest Element "+a[a.length-2]);
	}

}
