package ArraysNewProgramms;

public class Move0s1s2snew{

	public static void main(String[] args) {
     int[] a= {0,1,2,1,2,0,1,2,0,2};
     int[] b=new int[a.length];
     int j=0;
     for(int i=0;i<a.length;i++)
     {
    	 if(a[i]==0)
    	 {
    		b[j]=a[i];
    		j++;
    	 }
     }
     for(int i=0;i<a.length;i++)
     {
    	 if(a[i]==1)
    	 {
    		 b[j]=a[i];
    		 j++;
    	 }
     }
     for(int i=0;i<a.length;i++)
     {
    	 if(a[i]==2)
    	 {
    		 b[j]=a[i];
    		 j++;
    	 }
     }
     for(int n:b)
 	{
 		System.out.print(n+" ");
 	}
	}

}
