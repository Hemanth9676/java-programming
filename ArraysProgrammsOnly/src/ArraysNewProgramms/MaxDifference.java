package ArraysNewProgramms;

public class MaxDifference {
public static void main(String[] args) {
	int[] a= {10,60,30,20};
	int min=a[0];
	int max=a[0];
	for(int i=0;i<a.length;i++)
	{
		if(a[i]<min) 
			{
			min=a[i];
			}
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println(min);
	System.out.println(max);
	System.out.println("max difference is "+ (max-min));
}
}
