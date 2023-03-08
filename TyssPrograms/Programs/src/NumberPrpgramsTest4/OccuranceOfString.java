package NumberPrpgramsTest4;

public class OccuranceOfString {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			int count=1;
			if(s2.indexOf(ch)==-1)
            {
                for(int j=i+1;j<s1.length();j++)
                {
                	if(s1.charAt(i)==s1.charAt(j))
                	{
                		count++;
                	}
                }
                System.out.println(ch+"="+count);
                s2+=ch;
            }
		}
	}

}
