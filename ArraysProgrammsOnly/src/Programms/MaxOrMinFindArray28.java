package Programms;

public class MaxOrMinFindArray28 {
//find maximum and minimum value in array.
	public static void main(String[] args) {
     int[] a= {10,20,30,40,50};
     int min=a[0];
     int max=a[0];
     
     for(int i=0;i<a.length;i++)
     {
    	 if(a[i]<min)  min=a[i];
     }
     for(int i=0;i<a.length;i++)
     {
    	 if(a[i]>max)  max=a[i];
     }
     System.out.println("min value is "+min);
     System.out.println("max value is "+max);
	}

}
