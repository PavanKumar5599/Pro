package practice_package;

public class Thistype {

	// Java Program to implement
	// Java this reference

	// Driver Class
	

		// Fields Declared
		String name;
		int age;

		// Constructor
		Thistype(String name, int age)
		{
			//“this” in Java is a keyword that refers to the current object instance. 
			//It can be used to call current class methods and fields,
			this.name = name;
			this.age = age;
		}

		// Getter for name
		public String get_name() { return name; }

		// Setter for name
		public void change_name(String name)
		{
			this.name = name;
		}

		// Method to Print the Details of
		// the person
		public void printDetails()
		{
			System.out.println("Name: " + name);
			System.out.println("Age: " + age);
			System.out.println();
		}

		// main function
		public static void main(String[] args)
		{
			// Objects Declared
			Thistype first = new Thistype("ABC", 18);
			Thistype second = new Thistype("XYZ", 22);

			first.printDetails();
			second.printDetails();

			first.change_name("PQR");
			System.out.println("Name has been changed to: "+ first.get_name());
		}
	


	}


