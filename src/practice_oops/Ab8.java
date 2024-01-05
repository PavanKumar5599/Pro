/*Write a Java program to create an abstract class Person with abstract methods eat() and exercise(). 

 * Create subclasses Athlete and LazyPerson that extend the Person class 
 * and implement the respective methods to describe how each person eats and exercise 
 */

package practice_oops;

abstract class Person{
	abstract void eat();
	abstract void exercise();
	
}
class Athlete extends Person{

	
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("Athlete eat limitedly");
	}


	void exercise() { 
		// TODO Auto-generated method stub
		System.out.println("Athlete exercice daily");
	}
	
}
class LazyPerson extends Person{

	
	void eat() {
		// TODO Auto-generated method stub
		System.out.println("LazyPerson eat limitless");
	}


	void exercise() { 
		// TODO Auto-generated method stub
		System.out.println("LazyPerson did not exercice daily");
	}
	
}

public class Ab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LazyPerson obj=new LazyPerson();
		Athlete ob=new Athlete();
		
		obj.eat();
		obj.exercise();
		
		ob.eat();
		ob.exercise();

	}

}
