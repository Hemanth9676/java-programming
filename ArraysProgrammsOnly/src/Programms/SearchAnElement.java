package Programms;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class SearchAnElement {
//Search An Element In Array.
	public static void main(String[] args) throws IOException {
		boolean isPresent=false;
		Integer index=null;
    int[] a= {10,40,30,20,60};
    System.out.println("Enter a SearchNumber");
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    String input=br.readLine();
    Integer n=Integer.valueOf(input);
    
    for(int i=0;i<a.length;i++)
    {
    	if(a[i]==n)
    	{
    		isPresent=true;
    		index=i;
    	}
    }
    if(isPresent==true)
    {
    System.out.println("Element is Preent at index");	
    }
    else
    {
    	System.out.println("Element is not Present in array");
    }
	}

}
