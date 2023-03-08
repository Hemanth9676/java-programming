package StringAssignment;

import java.util.Scanner;

public class Project2 {
	public static void main(String[] args) {
		 Scanner scn=new Scanner(System.in);
		    System.out.println("Enter a String");
		    String s1=scn.next();
		    String s2="";
		    char[] ch=s1.toCharArray();
		    s2+=(char)(ch[0]-25);

		    for(int i=1;i<ch.length;i++)
		    {
		         s2+=(char)(ch[i]+1);
		    }
		    System.out.println(s2);
		    String s3="";
		    for(int i=s2.length()-1;i>=0;i--)
		    {
		    	s3+=s2.charAt(i);
		    }
		    System.out.println(s3);
			}

		}

