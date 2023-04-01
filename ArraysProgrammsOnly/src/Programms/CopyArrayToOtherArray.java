package Programms;

public class CopyArrayToOtherArray {
	//How to copy elements from one array to other in java?
	public static void main(String[] args) {
    int[] a= {10,20,30,40,50};
    int[] b=new int[a.length];
    for(int i=0;i<a.length;i++)
    {
    	b[i]=a[i];
    }
    for(int i=0;i<b.length;i++)
    {
    	System.out.println(b[i]);
    }
	}

}
