package Programms;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesinArray28 {
public static void main(String[] args) {
	int[] a= {10,20,30,20,30,50};
	bruteForce(a);
	extraMemory(a);
	
}

private static void extraMemory(int[] a) {
Set<Integer> set=new HashSet<>();
for(int i=0;i<a.length;i++)
{
	if(set.contains(a[i])) {
		System.out.println("Duplicates value is "+a[i]);
	}
	else
	{
		set.add(a[i]);
	}
}
}

private static void bruteForce(int[] a) {
	for(int i=0;i<a.length;i++)
	{
		for(int j=i+1;j<a.length;j++)
		{
			if(a[i]==a[j])
			{
				System.out.println("Duplicates value is "+a[i]);
			}
		}
	}
}
}
