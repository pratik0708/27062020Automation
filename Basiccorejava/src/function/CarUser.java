package function;

public class CarUser {

	public static void main(String[] args) {
		Car car1= new Car();
		
		car1.colour="Red";
		car1.capacity=4;
		car1.features();
		
		Car car2= new Car();
		car2.colour="Blue";
		car2.capacity=6;
		car2.features();
		
		Car car3= new Car();
		car3.colour="Yellow";
		car3.capacity=9;
		car3.features();

		Car car4= new Car("Silver", 5);
		car4.features();
		
	}

}
