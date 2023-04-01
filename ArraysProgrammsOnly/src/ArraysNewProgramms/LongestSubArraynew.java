package ArraysNewProgramms;

public class LongestSubArraynew {

	public static void main(String[] args) {
    int[] a= {10,20,1,5,4,7,8,19,11};
    int len=findlength(a);
    System.out.println(len);
	}

	private static int findlength(int[] a) {
		if(a.length==0) {
		return 0;
		}
		int len=1;
		int maxLen=1;
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>a[i-1])
			{
				len++;
			}
			else
			{
				len=1;
			}
			maxLen=Math.max(len, maxLen);
		}
		return maxLen;
	}

}
