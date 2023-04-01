package ArraysNewProgramms;

public class TripLetGivenSumisEqualToKnew {

	public static void main(String[] args) {
     int[] a= {1,2,3,4,6,8,7,9};
     int n=13;
     boolean result=findTriplet(a,n);
     if(result) {
    	 System.out.println("Exists");
     }
     else
     {
    	 System.out.println("Not Exists");
     }
	}
	public static boolean findTriplet(int[] a,int n) {
    for(int i=0;i<a.length;i++)
    {
    	for(int j=i+1;j<a.length;j++)
    	{
    		for(int k=j+1;j<a.length;j++)
    		{
    			if(a[i]+a[j]+a[k]==n)
    			{
    				return true;
    		}
    	}
    }
	}
	return false;

}
}
