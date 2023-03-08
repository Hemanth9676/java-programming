package Array2d27;

public class Compare2DMatrixSameOrNot {

	public static void main(String[] args) {
		int[][] a1= {{10,20,30},{40,50,60},{70,80,90}};
		int[][] a2= {{10,20,30},{40,50,60},{70,80,90}};
		boolean flag=true;
		for(int i=0;i<a1.length;i++)
		{
			for(int j=0;j<a1[i].length;j++)
			{
				if(a1[i][j]!=a2[i][j])
				{
					flag=false;
					break;
					
				}
			}
			
		}
				if(flag)
				{
					System.out.println("Two arrays are same");
				
				}
				else
				{
					System.out.println("2arrays are not same ");
			}
			
	}

}

