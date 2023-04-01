package Programms;

import java.util.Arrays;

public class SortAnArray {

	public static void main(String[] args) {
     int[] a= {50,40,30,10,20};
     Arrays.sort(a);
     
     for(int i=0;i<a.length;i++)
     {
    	 System.out.println(a[i]);
    	 
//     for(int n:a) {           we can use for each loop also
//     System.out.println(n);
     }
	}

}
