package Array2d27;

public class EvenOrOddElementsArray {

	public static void main(String[] args) {
       int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
       int even = 0;
       int odd = 0;
       for(int i=0;i<a.length;i++)
       {
    	   for(int j=0;j<a[i].length;j++)
    	   {
    		   if(a[i][j]%2==0) even++;    		       			       					   
    		   else odd++;
    		  
    	   }
       }
    	   System.out.println(even+" even numbers");
    	   System.out.println(odd+" odd numbers");
       }
	}


