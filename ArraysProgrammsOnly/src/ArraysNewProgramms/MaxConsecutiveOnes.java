package ArraysNewProgramms;

public class MaxConsecutiveOnes {

	public static void main(String[] args) {
     int[] a= {1,1,0,0,0,1,1,1,1,1};
     int k=2;
     System.out.println(countConsecutiveOnes(a,k));
	}
	public static int countConsecutiveOnes(int[] a,int k) {
		int maxConsecutiveOne=0;
		int start=0;
		int zeroCount=0;
		for(int end=0;end<a.length;end++) {
			if(a[end]==0)
			{
				zeroCount++;
			}
			while(zeroCount>k)
			{
				if(a[start]==0)
				{
					zeroCount--;
				}
				start++;
			}
			maxConsecutiveOne=Math.max(maxConsecutiveOne, end-start+1);
			
		}
		return maxConsecutiveOne;
	}

}
