package oops.polymorphism;

public class MethodOverLoading {

	public static void main(String[] args) {
		
		MethodOverLoading obj= new MethodOverLoading();
		obj.sum(10,20,30);
		obj.sum(10,20);
	}
		
		public int sum(int a, int b)
		{
			return a+b;
			
		}
		public int sum(int a, int b, int c)
		
		{
			return a+b+c;
			
		}

	}


