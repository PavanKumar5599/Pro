package practice_oops;

/*Write a Java program to create an abstract class Animal with abstract methods eat() and sleep(). 
 * Create subclasses Lion, Tiger, and Deer that extend the Animal class and implement the eat() and sleep()
 *  methods differently based on their specific behavior.
 */

abstract class Ani{
	public abstract void sleep();
	public abstract void eat();
}

class Lio extends Ani{
	public void sleep() {
		System.out.println("lion is sleep");
	}
	public void eat() {
		System.out.println("lion is eat");
	}
}
class Tige extends Ani{
	public void sleep() {
		System.out.println("Tiger is sleep");
	}
	public void eat() {
		System.out.println("Tiger is eat");
	}
}
class Deer extends Ani{
	public void sleep() {
		System.out.println("deer is sleep");
	}
	public void eat() {
		System.out.println("deer is eat");
	}
}
public class Ab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tige ob=new Tige();
		Lio obj=new Lio();
		Deer obje=new Deer();
		
		ob.eat();
		ob.sleep();
		obj.eat();
		obj.sleep();
		obje.eat();
		obje.sleep();

	}

}
