package Test18;

public class P4 {

	public static void main(String[] args) {
        int n=5;
        int count=1;
        for(int i=1;i<=n;i++)
        {
        	for(int j=1;j<=i;j++)
        	{
        		System.out.print(count%2);
        		count++;
        	}
        	System.out.println();
        }
	}

}
