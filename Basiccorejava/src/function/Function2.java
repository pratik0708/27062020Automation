package function;

public class Function2 {
	
	public static String name="Pratik";

	public static void main(String[] args) {
		
	//Method overloading is where 2 or more function with different parameters with same name.
		
		
		
		sum(10,20);
		sum(20,30);
		sum(40,50,10);
		message("Pratik");
		
		eligibility("Pratik", 28);
		eligibility("abc", 17);
				
          System.out.println(name);
          
	}
	
	public static void sum(int a, int b)
	{
		System.out.println(a+b);
	}

	public static void sum(int a, int b, int c)
	{
		System.out.println(a+b+c);
		
	}
	public static void message(String name)
	{
		System.out.println("Wlecome"+name);
	}
	
	public static void eligibility(String name, int age)
	{
		//put some logic
		
		System.out.println("Pratik, you are eligible");
		System.out.println("abc, you are not eligible");
		
	}
	
	
	
}

