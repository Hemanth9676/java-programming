package StringAssignment;

import java.util.Scanner;

public class EachCharCountWithOutInbiltMethod4 {

	public static void main(String[] args) {
		{
           Scanner scn=new Scanner(System.in);
           System.out.println("Enter a String");
			String s=scn.next();
			char[]ch=s.toCharArray();
			for(int i=0;i<ch.length;i++)
			{
				int count=1;
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j] && ch[j]!='*')
					{
						count++;
						ch[j]='*';
					}
				}
				if(ch[i]!='*') {
					System.out.print(ch[i]+""+count);
				}
			}
		}

	}
}
