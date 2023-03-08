package ArraysTest2;

public class Maxmum {

	public static void main(String[] args) {
      int [] a= {100,90,70,80,10};
      int max1=a[0];
      int max2=a[1];
      for(int i=1;i<=a.length-1;i++)
      {
    	  if(a[i]>max1)
    	  {
    		  max2=max1;
    		  max1=a[i];
    	  }
    	  else if(a[i]>max2)
    	  {
    		  max2=a[i];
    	  }
      }
      System.out.println(max2);
	}

}
