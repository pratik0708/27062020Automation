package variableAndDatatype;

import function.AccessModifiers;

public class TestAccessModAtProjectLevel extends AccessModifiers{

	public static void main(String[] args) {
		
		AccessModifiers obj= new AccessModifiers();
		obj.publicFunction();
		
		TestAccessModAtProjectLevel obj2= new TestAccessModAtProjectLevel();
       obj2.protectedFunction();
        
	}

}
