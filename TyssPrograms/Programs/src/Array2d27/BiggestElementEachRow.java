package Array2d27;

public class BiggestElementEachRow {

	public static void main(String[] args) {
		int[][] a1= {{10,20,30},{40,50,60},{70,80,90}};
		int bg;
		for(int i=0;i<a1.length;i++)
		{
			bg=a1[i][0];
			for(int j=0;j<a1[i].length;j++)
			{
				if(bg<a1[i][j])  bg=a1[i][j];
			}
			System.out.print(bg+" ");
		}
		System.out.println();
		
	}

}
