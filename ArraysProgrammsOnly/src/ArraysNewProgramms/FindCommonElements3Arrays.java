package ArraysNewProgramms;

public class FindCommonElements3Arrays {

	public static void main(String[] args) {
    int[] a= {10,20,30,40,50};
    int[] b= {10,20,30,40,60,50};
    int[] c= {10,20,30,70,50};
    for(int i=0;i<a.length;i++)
    {
    	for(int j=0;j<b.length;j++)
    	{
    		for(int k=0;k<c.length;k++)
    		{
    			if(a[i]==b[j] && b[j]==c[k] && a[i]==c[k])
    			{
    				System.out.println(a[i]);
    			}
    		}
    	}
    }
    
	}

}
