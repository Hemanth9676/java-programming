package Programms;

public class LeftRotateOfElement {
//wajp to print leftrotation element,in given array.
	public static void main(String[] args) {
     int [] a= {10,20,30,40,50};
     //0 index value store in temp.
     int temp=a[0];
     //shift one element to left.
     for(int i=1;i<a.length;i++)
     {
    	 a[i-1]=a[i];
     }
     //store the temp value in last position.
     a[a.length-1]=temp;
     for(int n:a)
     {
    	 System.out.println(n);
     }
	}

}
