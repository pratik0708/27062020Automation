package function;

public class CallVariables {

	public static void main(String[] args) {
		
		System.out.println(Variables.name);
		
		Variables.name="Pratik";
		
		Variables ref= new Variables();
		
		//Change the values
		ref.name2="Ajinkya";
		ref.name2="Aniket";
		
		//Call all the variables again
		Variables ref2= new Variables();
						
		System.out.println(ref2.name);
		System.out.println(ref.name);
		
		System.out.println(ref2.name2);
		System.out.println(ref.name2);
		

	}

}
