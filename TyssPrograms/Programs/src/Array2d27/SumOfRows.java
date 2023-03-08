package Array2d27;

public class SumOfRows {

	public static void main(String[] args) {
		int[][] a1= {{10,20,30},{40,50,60},{70,80,90}};
		int[] sum=new int[3];
		  for(int i=0;i<a1.length;i++)
	       {
	    	   for(int j=0;j<a1[i].length;j++)
	    	   {
	    		   sum[i]+=a1[i][j];
	    	   }
	       }
		  for(int n:sum)
		  {
			  System.out.print(n+" ");
		  }
		  System.out.println();
	}

}
