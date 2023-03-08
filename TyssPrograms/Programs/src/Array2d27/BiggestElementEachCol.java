 package Array2d27;

public class BiggestElementEachCol {

	public static void main(String[] args) {
		int[][] a1= {{10,20,30},{40,50,60},{70,80,90}};
		int bg;
		for(int i=0;i<a1.length;i++)
		{                                                     
			bg=a1[i][0];
			for(int j=0;j<a1[i].length;j++)
			{
				if(bg<a1[j][i])  bg=a1[j][i];
			}
			System.out.print(bg+" ");
		}
		System.out.println();
		
	}

}