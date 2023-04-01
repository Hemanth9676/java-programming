package Programms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElementCollection {

	public static void main(String[] args) {
     String[] a= {"hello","Bnagalore","Bye"};
     List<String> l=new ArrayList(Arrays.asList(a));
     l.remove(2);
     System.out.println(l);
	}

}
