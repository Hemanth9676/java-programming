package ArraysNewProgramms;

public class MaxSubArray {

	public static void main(String[] args) {
      int[] a= {1,2,-5,4,3,8,5};
      int maxSum=a[0];
      int sum =a[0];
      for(int i=0;i<a.length;i++)
      {
    	  if(sum<0)
    	  {
    		  sum=a[i];
    	  }
    	  else
    	  {
    		  sum=sum+a[i];
    	  }
    	  maxSum=Math.max(sum, maxSum);
      }
      System.out.println(maxSum);
	}

}
