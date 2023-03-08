package ArraysTest2;

public class RemoveElement {

	public static void main(String[] args) {
        int[] a= {10,20,30,40,50};
        int ind=2;
        if(ind>=a.length-1)
        {
        	System.out.println("Invalid Array");
        }
        else {
        	int[] a2=new int[a.length];
        	int temp = 0;
        
        for(int i=0;i<a2.length;i++)
        {
        	if(i!=ind)
        	{
				a2[temp]=a[i];
        		temp++;
        	}
        }
       for(int i=0;i<=a2.length-1;i++)
       {
    	   System.out.println(a2[i]);
       }
       }
        	
	}

}
