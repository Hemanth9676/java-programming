package NumberProgramsAssignment;

public class PrimeNumberRange {

	public static void main(String[] args) {
     for(int i=1;i<=50;i++)
     {
    	 int count=0;
    	 for(int j=1;j<=i;j++)
    	 {
    		 if(i%j==0)
    		 {
    			 count++;
    		 }
    	 }
    	 if(count==2)
    	 {
    		 System.out.println(i);
    	 }
    }
		for(int i=1;i<=100;i++)
		{
			if(i<=1)
			{
				System.out.println(i+"Not Prime");
				continue;
				
			}
			boolean flag=true;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					flag=false;
					break;
				}
			}
			if(flag)
			{
				System.out.println(i+" Prime");
			}
			else
			{
				System.out.println(i+"Not a Prime");
			}
		}
		
	}

}
