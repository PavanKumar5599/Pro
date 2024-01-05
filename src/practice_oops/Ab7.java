package practice_oops;

// Write a Java program to create an abstract class Vehicle with abstract methods startEngine() and stopEngine().
//Create subclasses Car and Motorcycle that extend the Vehicle class and
//implement the respective methods to start and stop the engines for each vehicle type.

abstract class Vehicle{
	abstract void startEngine();
	abstract void stopEngine();
	
}
class Car extends Vehicle{

	
	void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Car engine has been started");
	}


	void stopEngine() { 
		// TODO Auto-generated method stub
		System.out.println("Car engine has been stoped");
	}
	
}

class Motorcycle extends Vehicle{

	
	void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("Motorcycle engine has been started");
	}


	void stopEngine() { 
		// TODO Auto-generated method stub
		System.out.println("Motorcycle engine has been stoped");
	}
	
}
public class Ab7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motorcycle obj=new Motorcycle();
		Car ob=new Car();
		
		obj.startEngine();
		obj.stopEngine();
		ob.startEngine();
		ob.stopEngine();

	}

}
