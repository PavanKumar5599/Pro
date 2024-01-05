package practice_oops;

/*Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). 
 * Create subclasses Circle and Triangle that extend the Shape class 
 * and implement the respective methods to calculate the area and perimeter of each shape.
 */
abstract class Shape{
	
	abstract void calculateArea();
	abstract void calculatePerimeter();
}
class Circle extends Shape{
int r=10;

	void calculateArea() {
		// TODO Auto-generated method stub
		
		double area=3.14*r*r;
		System.out.println("circle area : "+area);
	}

	
	void calculatePerimeter() {
		// TODO Auto-generated method stub
		double perimeter=2*3.14*r;  
		System.out.println("circle perimeter : "+perimeter);
	}
	
}
class Triangle extends Shape{


	
	void calculateArea() {
		// TODO Auto-generated method stub
		System.out.println("triamgle area : "+0.5*10*12);//1/2*bh
	}

	
	void calculatePerimeter() {
		// TODO Auto-generated method stub
		System.out.println("triangle perimeter : "+10+12+13);//a+b+c
	}
	
}

public class Ab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangle ob=new Triangle();
		Circle o=new Circle();
		
		ob.calculateArea();
		ob.calculatePerimeter();
		o.calculateArea();
		o.calculatePerimeter();
		

	}

}
