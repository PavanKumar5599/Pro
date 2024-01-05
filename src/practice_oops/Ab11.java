package practice_oops;

//Write a Java program to create an abstract class Bird with abstract methods fly() and makeSound().
//Create subclasses Eagle and Hawk that extend the Bird class and implement the respective methods 
//to describe how each bird flies and makes a sound.

abstract class Bird{
	abstract void fly();
	abstract void makeSound();
	
}
class Eagle extends Bird{

	
	void fly() {
		// TODO Auto-generated method stub
		System.out.println(" Eagle is flying");
	}


	void makeSound() { 
		// TODO Auto-generated method stub
		System.out.println("Eagle is make sound");
	}
	
}

class Hawk extends Bird{

	
	void fly() {
		// TODO Auto-generated method stub
		System.out.println(" hawk is flying");
	}


	void makeSound() { 
		// TODO Auto-generated method stub
		System.out.println("hawk is make sound");
	}
	
}



public class Ab11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hawk obj=new Hawk();
		obj.fly();
		obj.makeSound();
		Eagle ob=new Eagle();
		ob.fly();
		ob.makeSound();
		
		

	}

}
