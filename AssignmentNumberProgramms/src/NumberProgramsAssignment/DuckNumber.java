package NumberProgramsAssignment;

public class DuckNumber {

	public static void main(String[] args) {

		       String s="1230";
		       
		       boolean flag=duck(s);
		       if(flag)
		       {
		    	   System.out.println("duck number");
		       }else
		       {
		    	   System.out.println("not duck number");
		       }
		       
			}

			private static boolean duck(String s) {
				 
				if(s.charAt(0)=='0')
				{
					return false;
				}else
				{
					for(int i=1;i<s.length();i++)
					{
						if(s.charAt(i)=='0')
						{
							return true;
						}
					}
				}
			
				
				return false;
			}

		}
