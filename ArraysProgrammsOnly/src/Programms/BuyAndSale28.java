package Programms;

public class BuyAndSale28 {

	public static void main(String[] args) {
    int a[]= {5,3,10,29,100};
    int min=Integer.MAX_VALUE;
    int max=Integer.MIN_VALUE;
//    int max=0;
    for(int i=0;i<a.length;i++)
    {
    	if(a[i]<min)
    	{
    		min=a[i]; //5
    	}
    	if(a[i]-min>max)
    	{
    		max=a[i]-min;  //5/24/95
    	}
    }
    System.out.println("Max Value= "+max);
	}

}
