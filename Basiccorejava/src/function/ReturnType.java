package function;

public class ReturnType {

	public static void main(String[] args) {
		
		//Static function can only call static methods and variables
		
		int add=sum(10,20);
		System.out.println(add);
		
		boolean c=eligible(10);
		System.out.println("you are eligible");
		System.out.println("you are not eligible");

	}

	public static int sum(int a, int b)
	{
		return a+b;
		
	}
	
	public static boolean eligible(int age)
	{
		if(age>=18)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
