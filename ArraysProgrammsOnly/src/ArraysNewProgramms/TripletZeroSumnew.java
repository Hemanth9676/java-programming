package ArraysNewProgramms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletZeroSumnew {

	public static void main(String[] args) {
    int[] a= {-1,0,1,2,-1,-4};
    List<List<Integer>> result=threeSum(a);
    result.forEach(values->{
    	System.out.println(values);
    });
	 }
	public static List<List<Integer>> threeSum(int[] a){
		List<List<Integer>> result=new ArrayList<>();
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			int start=i+1;
			int end=a.length-1;
			
			if(i>0 && a[i]==a[i-1])
			{
				continue;
			}
			while(start<end)
			{
				if(end<a.length-1 && a[end]==a[end+1])
				{
					end--;
					continue;
				}
				if(a[i]+a[start]+a[end]==0) {
					List<Integer> val=Arrays.asList(a[i],a[start],a[end]);
					result.add(val);
					start++;
					end--;
				}
				else if(a[i]+a[start]+a[end]<0) {
					start++;
				}
				else
				{
					end--;
				}
			}
		}
		return result;
	}

}
