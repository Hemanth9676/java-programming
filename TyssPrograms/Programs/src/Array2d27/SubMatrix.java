package Array2d27;

public class SubMatrix {

	public static void main(String[] args) {
		int[][] a1= {{10,20,30},{40,50,60},{70,80,90}};
	       int[][] a2= {{1,2,3},{4,5,6},{7,8,9}};
	       int[][] sum=new int[3][3];
	       for(int i=0;i<sum.length;i++)
	       {
	    	   for(int j=0;j<sum.length;j++)
	    	   {
	    		   sum[i][j]=a1[i][j]-a2[i][j];
	    		   System.out.print(sum[i][j]+" ");
	    	   }
	    	   System.out.println();
	    	   
	}
	}
}
