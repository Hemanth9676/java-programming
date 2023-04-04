package ArraysNewProgramms;

import java.util.Arrays;

public class ProductOfAnArrayExceptItSelf {

	public static void main(String[] args) {
      int[] a= {4,2,1,7};     
      int prod=1;
      int[] arr=new int[a.length];
      for(int i=0;i<a.length;i++)
      {
    	  prod*=a[i];
      }
      for(int i=0;i<a.length;i++) {
    	  arr[i]=prod/a[i];
      }
      System.out.println(Arrays.toString(arr));
      
	}

}
