package NumberPrpgramsTest4;

public class Perfect {

	public static void main(String[] args) {
     int n=6;
     int sum=0;
     for(int i=1;i<=n/2;i++)
     {
    	 if(n%2==0)
    	 {
    		 sum+=i;
    	 }
     }
     if(sum==n)
     {
    	 System.out.println("Perfect");
     }
     else
     {
    	 System.out.println("Not Perfect");
     }
	}

}
