package exceptionHandling;

public class TryCatchBlock {

	public static functions fun;

	public static void main(String[] args) {

		try {
			// step 1: Verify about link in present
			int a = 10;
			int b = 2;
			System.out.println(a / b);

			// 2nd Exception
			String[] str = new String[2];
			str[2] = "Pratik";

			// step 3: Verify project link is present
			fun.fun1();

		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException Occurred :" + e.getMessage());
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutBoundsException Occurred :" + e.getMessage());
			
		} catch (NullPointerException e) {
			System.out.println("NullPointerException Occurred :" + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception Occurred :" + e.getMessage());
		}

	}

}
