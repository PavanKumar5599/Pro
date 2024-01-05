package practice_oops;

/*Write a Java program to create an abstract class Shape3D with abstract methods calculateVolume() and calculateSurfaceArea().
 *  Create subclasses Sphere and Cube that extend the Shape3D class 
 *  and implement the respective methods to calculate the volume and surface area of each shape.
 */

abstract class Shape3d{
	abstract void calculateVolume();
	abstract void calculateSurfaceArea();
	
}
class Sphere extends Shape3d{

	int r=2;
	void calculateVolume() {//  v=4/3*3.14*r**3
		// TODO Auto-generated method stub
		System.out.println("calculate the valume of sphere ="+4/3f*3.14*r*r*r);
	}


	void calculateSurfaceArea() { ///a=4pir**2
		// TODO Auto-generated method stub
		System.out.println("calculate the surfaceArea of sphere ="+4*3.14*r*r);
	}
	
}

class Cube extends Shape3d{

	int a=23;
	void calculateVolume() { //v=a**3
		// TODO Auto-generated method stub
		System.out.println("calculate the valume of Cube ="+a*a*a);
	}


	void calculateSurfaceArea() { //a=6a**2
		// TODO Auto-generated method stub
		System.out.println("calculate the surfaceArea of Cube ="+6*a*a);
	}
	
}
//Math.pow(number, 2)
//for cube
//Math.pow(number, 3)
//for squre root
//Math.sqrt(number)

public class Ab6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sphere ob=new Sphere();
		Cube obj=new Cube();
		
		ob.calculateSurfaceArea();
		ob.calculateVolume();
		obj.calculateSurfaceArea();
		obj.calculateVolume();

	}

}
