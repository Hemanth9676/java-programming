package ArraysNewProgramms;

public class MaxConsigativeOnes {

	public static void main(String[] args) {
    //Maximum Consecutive Ones in an Array of 0s and 1s
		int[] a= {1,1,0,0,1,1,1,1,1,0};
		System.out.println(countConsecutiveOnes(a));
	}
	public static int countConsecutiveOnes(int[] a) {
		int count=0;
		int maxConsecutiveOne=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==1) {
				count++;
				maxConsecutiveOne=Math.max(count, maxConsecutiveOne);
				
			}
			else
			{
				count=0;
			}
		}
		return maxConsecutiveOne;
	}

}
