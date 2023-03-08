package Array2d27;

public class SparceMatrix {

	public static void main(String[] args) {
      int[][] a= {{4,6,0},{0,0,2},{3,0,0}};
      int count=0;
      int num=0;
      for(int i=0;i<a.length;i++)
      {
    	  for(int j=0;j<a[i].length;j++)
    	  {
    		  if(a[i][j]==0)   count++;
    		  else if(a[i][j]!=0)  num++;  
    	  }
      }
      if(count>num)
      {
    	  System.out.println("Sparse");
      }
      else
      {
    	  System.out.println("Not Sparse");
      }
	}

}
