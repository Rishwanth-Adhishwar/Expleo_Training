package polymorphism;

class Vehicle //parent class
{
	void run()
	{
		System.out.println("Vehicle is running");
	}
}

class Car extends Vehicle //child class
{
	void run()   //Overriden method
	{
		System.out.println("Car is running");
	}
}

public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle obj= new Vehicle();
		obj.run();//Vehicle class run method invoked
		
		Vehicle obj1= new Car();
		obj1.run();//Car class run method invoked(upcasting)
		

	}

}
