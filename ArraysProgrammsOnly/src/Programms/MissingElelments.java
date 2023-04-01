package Programms;

public class MissingElelments {

	public static void main(String[] args) {
		int[] a= {1,4,10};
      int i=1;
      int j=0;
     do
      {
    	  if(i==a[j]);
    	  {
    	      i++;
    		  j++;
    	  }
    	 
    		  while(i<a[j])
    		  {
    			  System.out.println(i);
    			  i++;
    			 
    		  }   
      }while(j<a.length-1);
	}

}
