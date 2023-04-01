package Programms;

public class FindReapetedElements28 {
//Java Program to find repeating element in an array
	public static void main(String[] args) {
     int[] a= {1,3,4,5,1,3};
     int[] temp=new int[a.length];
     for(int i=0;i<a.length;i++)
     {
    	 if(temp[a[i]]==1)
    	 {
    		 System.out.println(a[i]);
    	 }
    	 else
    	 {
    		 temp[a[i]]++;
    	 }
     }
	}

}
