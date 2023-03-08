package StringAssignment;

public class CountSpace11 {

	public static void main(String[] args) {
       String s="  Hemanth  ";
       char[] a=s.toCharArray();
       int count=0;
       for(int i=0;i<a.length;i++)
       {
       if(a[i]==' ')
       {
    	   count++;
       }
      
       }
       System.out.println(count);
	}

}
