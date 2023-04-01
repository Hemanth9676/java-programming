package ArraysNewProgramms;

import java.util.Arrays;

public class RightRotation3Elementsnew {

	public static void main(String[] args) {
     int[] a= {40,50,10,20,30};
     int[] b=new int[a.length];
     int n=3;
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
//     System.out.println(Arrays.toString(a));
     for(int i=0;i<b.length;i++) {
    	 System.out.print(b[i]+" ");
     }
	}

}
