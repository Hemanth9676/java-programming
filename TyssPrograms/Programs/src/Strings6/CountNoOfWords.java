package Strings6;

public class CountNoOfWords {

	public static void main(String[] args) {
      String s1=" Bangalore is nice city  ";
      int count=1;
      if(s1.charAt(0)==' ') count--;
      for(int i=0;i<s1.length()-1;i++)
      {
    	  
    	  if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ')
    	  {
    		  count++;
    	  }
      }
      System.out.println(count);
	}

}
