package Programms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//Write a java program to check whether array contains duplicates
public class ContainsDuplicates28 {

	public static void main(String[] args) {
    String[] duplicate=new String[] {"java","web","c","java"};
    List dupliList=Arrays.asList(duplicate);
    Set dupliSet=new HashSet<>(dupliList);
    if(dupliList.size()!=dupliSet.size())
    {
    	System.out.println("The Array Contains Duplicates");
    }
    else
    {
    	System.out.println("The array doesn't contains duplicates");
    }
    		
	}

}
