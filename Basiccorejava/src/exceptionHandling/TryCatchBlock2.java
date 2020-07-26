package exceptionHandling;

public class TryCatchBlock2 {
	
	public static functions fun;

	public static void main(String[] args) {
		
		        //step 1: Verify about link in present
				try {
		        int a=10;
				int b=0;
				System.out.println(a/b);
				} catch (Exception e) {
					System.out.println("Exception Occurred :" + e.getMessage());
				}
				
								
				//2nd Exception
				try {
				String[] str=new String[2];		
				str[2]="Pratik";
				} catch (Exception e) {
					System.out.println("Exception Occurred :" + e.getMessage());
					
				}
				//step 3: Verify project link is present
		         fun.fun1();
		
		

	}

}
