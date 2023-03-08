package Array2D;

import java.util.Scanner;

public class CreatingArrayChar {

	public static void main(String[] args) {
		       Scanner scn=new Scanner(System.in);
		       System.out.println("Enter a row");
		       int row=scn.nextInt();
		       System.out.println("Enter a rcol");
		       int col=scn.nextInt();
		       char a[][]=new char[row][col];
		       for(int i=0;i<a.length;i++)
		       {
		    	   System.out.println("Enter the data for rown no "+(i+1));
		    	   for(int j=0;j<a[i].length;j++)
		    	   {
		    		   a[i][j] =scn.next().charAt(0);
		    	   }
		       }
		       for(int i=0;i<a.length;i++)
		       {
		    	   for(int j=0;j<a[i].length;j++)
		    	   {
		    		   System.out.print(a[i][j]+"  ");
		    	   }
		    	   System.out.println();
		       }
			}

		}

	


