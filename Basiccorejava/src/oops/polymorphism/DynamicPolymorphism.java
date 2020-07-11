package oops.polymorphism;

import oops.inheritence.Mobile;
import oops.inheritence.Smartphones;
import oops.inheritence.Telephone;

public class DynamicPolymorphism {

	public static void main(String[] args) {

		// Telephone obj4;//webDriver

		// obj4= new Telephone();
		// obj4.calling();

		// obj4= new Mobile();//Chrome
		// obj4.calling();

		// obj4= new Smartphones();//firefox
		// obj4.calling();

		Telephone obj4 = null;

		String browserName = "Firefox";

		if (browserName.contentEquals("Chrome")) {
			obj4 = new Mobile();
		} else if (browserName.equals("Firefox")) {
			obj4 = new Mobile();
		}
		obj4.calling();
	}

}
