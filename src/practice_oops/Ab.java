package practice_oops;

/*Write a Java program to create an abstract class Animal with an abstract method called sound(). 
 * Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method
 *  to make a specific sound for each animal.
 */


 abstract class Animal{
	abstract void sound();
}
class Lion extends Animal{
	void sound() {
		System.out.println("Lion sound rorrrrr");
	}
}
	class Tiger extends Animal{
		void sound() {
			System.out.println("Tiger sound gadrrrrrrr");
		}

	}

public class Ab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lion obj=new Lion();
		Tiger ob=new Tiger();
		
		obj.sound();
		ob.sound();
		

	}

}
