package ArraysNewProgramms;

import java.util.Arrays;

public class SearchSortedAndRotatedArray {

	public static void main(String[] args) {
		int[] a= {40,50,10,20,30,77,8,9,0};
	     int[] b=new int[a.length];
	     int n=4;
	     int target=0;
	     int j=0;
	     for(int i=a.length-n;i<a.length;i++)
	     {
	    	 b[j]=a[i];
	    	 j++;
	    	
	     }
	     for(int i=0;i<a.length-n;i++)
	     {
	    	 b[j]=a[i];
	    	 j++;
	    	
	     }
//	     System.out.println(Arrays.toString(a));
	     for(int i=0;i<b.length;i++) {
	    	
	    	 System.out.println(b[i]+" ");
	    	 if(a[i]==target)  
	    		{
	    		System.out.println("Target Present");
	    		}
	     }
		}

	}
