package NumberPrpgramsTest4;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Email {

	public static void main(String[] args) {
       Scanner scn=new Scanner(System.in);
       System.out.println("Enter a Email");
       String email=scn.next();
       String re="[A-Z a-z]\\s*@[a-z A-Z]+[.](com\co\\.in\ac\\.in)";
       Pattern p=Pattern.compile(re);
       Matcher m=p.matcher(email);
       if(m.matches())
       {
    	   System.out.println(valid);
       }
       else
       {
    	   System.out.println("Not Valid");
       }
	}

}
