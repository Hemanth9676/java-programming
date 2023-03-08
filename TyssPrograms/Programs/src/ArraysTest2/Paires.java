package ArraysTest2;
public class Paires {
	public static void main(String[] args) {
         int[] a= {2,7,11,15};
         paire(a);
	}
	public static int[] paire(int[] a)
	{
		int [] res=new int[2];
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;i<a.length;j++)
			{
				if(a[i]+a[j]==9)
				{
					System.out.println(i+"+"+j+"= 9");
					res[0]=i;
					res[1]=j;
				}
			}
		}
		return res;
	}

}
