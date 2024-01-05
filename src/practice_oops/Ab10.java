/*Write a Java program to create an abstract class Shape2D with abstract methods draw() and resize().
 *  Create subclasses Rectangle and Circle that extend the Shape2D class 
 *  and implement the respective methods to draw and resize each shape
 */

package practice_oops;

abstract class Shape2D{
	abstract void draw();
	abstract void resize();
	
}
class Rectangle extends Shape2D{

	
	void draw() {
		// TODO Auto-generated method stub
		System.out.println(" Drawing Rectangle");
	}


	void resize() { 
		// TODO Auto-generated method stub
		System.out.println("resize the Rectangle");
	}
	
}

class Cir extends Shape2D{

	
	void draw() {
		// TODO Auto-generated method stub
		System.out.println(" Drawing the circle");
	}


	void resize() { 
		// TODO Auto-generated method stub
		System.out.println("resize the circle");
	}
	
}

public class Ab10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cir obj=new Cir();
		Rectangle ob=new Rectangle();
		
		obj.draw();
		obj.resize();
		ob.draw();
		ob.resize();

	}

}
