package Programms;

import java.util.HashMap;
import java.util.Map;
//WAJP To Find Majarity of Elements in array.

public class MajarityElements {

	public static void main(String[] args) {
      int[] a= {1,2,3,4,5,2,3,3,3,3,3};
      System.out.println("Majarity Element is = "+majarity(a,11));
	}
	 static int majarity(int[] a,int size)
	{
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i:a)
		{
			Integer val=map.get(i);
			if(val==null)
			{
				map.put(i,1);
				
			}
			else
			{
 				map.put(i, val+1);
			}
		}
		for(Map.Entry<Integer,Integer> entry:map.entrySet())
		{
			if(entry.getValue()>size/2)
			{
				return entry.getKey();
			}
			
		}
		return -1;
		
	}
	

}
