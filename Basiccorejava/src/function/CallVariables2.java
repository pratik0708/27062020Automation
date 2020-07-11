package function;

public class CallVariables2 {

	public static void main(String[] args) {
		
        
		Variables.name="Pratik";
		
		Variables ref= new Variables();
		
		//Change the values
		ref.name2="Manoj";
		ref.name2="Mahendra";
		
		//Call all the variables again
		Variables ref2= new Variables();
						
		System.out.println(ref2.name);
		System.out.println(ref.name);
		
		System.out.println(ref2.name2);
		System.out.println(ref.name2);
		
		

	}

}
