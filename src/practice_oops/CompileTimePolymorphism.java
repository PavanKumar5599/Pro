package practice_oops;

/*Write a Java program to create an abstract class Animal with an abstract method called sound(). 
 * Create subclasses Lion and Tiger that extend the Animal class and implement the sound() method
 *  to make a specific sound for each animal.
 */

public class CompileTimePolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathOperations mathOps = new MathOperations();

        System.out.println("Sum of two integers: " + mathOps.add(22,77));
        System.out.println("Sum of three integers: " + mathOps.add(22,44,78));
        System.out.println("Concatenation of two strings: " + mathOps.add1("Hello", " World"));

	}

}


class MathOperations {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public String add1(String a, String h) {
        return a+ h;
    }
}

