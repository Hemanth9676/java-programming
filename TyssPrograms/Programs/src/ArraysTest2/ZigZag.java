package ArraysTest2;

public class ZigZag {

	public static void main(String[] args) {
     int[] a1= {10,30,50,70,90};
     int[] a2= {20,40,60,80,100};
     int[] a3=new int[a1.length+a2.length];
     int j=0;
     int k=0;
     for(int i=0;i<=a3.length-1;i++)
     {
    	 if(j<a1.length)
    	 {
    		 a3[i]=a1[j];
    		 j++;
    		 i++;
    	 }
    	 if(k<a2.length)
    	 {
    		 a3[i]=a2[k];
    		 k++;
    	 }
     }
     for(int i=0;i<=a3.length-1;i++)
     {
    	 System.out.println(a3[i]);
     }
	}

}
