package Array2d27;

public class MaxValueOf2DArray {

	public static void main(String[] args) {
		int[][] a1= {{90,20,30},{40,150,60},{70,80,30}};
		int bg = a1[0][0];
		for(int i=0;i<a1.length;i++)
		{
			
			for(int j=0;j<a1[i].length;j++)
			{
				if(bg<a1[i][j])  bg=a1[i][j];
			}
		}
			System.out.print(bg+" ");		
	}

}
