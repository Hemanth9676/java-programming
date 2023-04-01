package ArraysNewProgramms;

import java.util.Arrays;

public class ReverseGroupOfArrays {

	public static void main(String[] args) {
     int[] a= {1,2,3,4,5,6,7,8,9};
     int k=5;
     for(int i=0;i<a.length;i=i+k) {
    	 int start=i;
    	 int end=Math.min(i+k-1, a.length-1);
    	 while(start<=end) {
    		 int temp=a[start];
    		 a[start]=a[end];
    		 a[end]=temp;
    		 start++;
    		 end--;
    	 }
     }
     for(int n:a) {
    	 System.out.print(n+" ");
     
	}
	}
}
