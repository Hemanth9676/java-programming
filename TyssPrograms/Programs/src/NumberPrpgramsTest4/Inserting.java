package NumberPrpgramsTest4;

public class Inserting {

	public static void main(String[] args) {
      int[] a= {1,2,4,5,6};
      int[] a2=new int[a.length+1];
      int ind=2;
      int j=0;
      int num=3;
      for(int i=0;i<=a.length-1;i++)
      {
    	  if(i==ind)
    	  {
    		  a2[j]=num;
    		  j++;
    	  }
    	  else
    	  {
    		  a2[j]=a[i];
    		  j++;
    		  
    	  }
      }
      for(int i=0;i<=a2.length-1;i++)
      {
    	  System.out.println(a2[i]);
      }
	}

}
