package Programms;

import java.util.Arrays;
import java.util.stream.IntStream;
//How to delete an element from Array in java using Java8 ?
public class DeleteElement28 {

	public static void main(String[] args) {
     int[] n= {1,2,3,4,5};
     int ind=3;
     int[] a=IntStream.range(0, n.length).filter(i->i!=ind).map(i->n[i]).toArray();
     System.out.println("new array= "+Arrays.toString(a));
	}

}
