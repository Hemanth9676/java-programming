package Test18;

public class P3 {

	public static void main(String[] args) {
		 int num=5;
		 for(int i=num-1;i>=0;i--)
		 {
			 for(int j=(-num)+1;j<num;j++)
			 {
				 int a=j;
				 if(a<0)  a=-a;
				 if(i>=a)
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.println();
		 }
	}

}
