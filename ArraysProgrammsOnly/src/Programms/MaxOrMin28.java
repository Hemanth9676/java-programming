package Programms;

public class MaxOrMin28 {
//How to find largest and smallest values in an array in java?
	public static void main(String[] args) {
    int [] a= {10,30,40,20,50};
   int max=Integer.MIN_VALUE;
   int min=Integer.MAX_VALUE;
   for(int n:a)
   {
	   if(n>max)
	   {
		   max=n;
	   }
   }
   System.out.println("Largest Number in an array "+max);
   for(int n:a)
   {
	   if(n<min)
	   {
		   min=n;
	   }
   }
   System.out.println("Sallest Number in an array "+min);
	}

}
