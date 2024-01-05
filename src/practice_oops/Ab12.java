package practice_oops;
/*
 * Write a Java program to create an abstract class GeometricShape with abstract methods area() and perimeter(). 
 * Create subclasses Triangle and Square that extend the GeometricShape class 
 * and implement the respective methods to calculate the area and perimeter of each shape.
 */
abstract class GeometricShape{
	abstract void area();
	abstract void perimeter();
	
}
class Tri extends GeometricShape{
	int a=21;
	int b=12;
	int c=34;
	int h=15;
	
	void area() {
		// TODO Auto-generated method stub
		
		System.out.println(" Area of Triangle = "+1/2f*b*h);
	}


	void perimeter() { 
		// TODO Auto-generated method stub
		System.out.println("perimeter of Triangle = "+a+b+c);
	}
	
}

class Square extends GeometricShape{
int a=14;
	
	void area() {
		// TODO Auto-generated method stub
		System.out.println(" Area of Square = "+Math.pow(a, 2));
	}


	void perimeter() { 
		// TODO Auto-generated method stub
		System.out.println("Perimeter of Square = "+4*a);
	}
	
}


public class Ab12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square obj=new Square();
		obj.area();
		obj.perimeter();
		Tri ob=new Tri();
		ob.area();
		ob.perimeter();
		

	}

}
