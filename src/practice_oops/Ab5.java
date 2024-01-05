package practice_oops;

/*5. Write a Java program to create an abstract class Employee with abstract methods calculateSalary() and displayInfo().
 *  Create subclasses Manager and Programmer that extend the Employee class
 *   and implement the respective methods to calculate salary and display information for each role.
 */

abstract class Employee {
	abstract void calculateSalary(double a) ;
	abstract void displayInfo(String name,double salary,int time);
}
class Manager  extends Employee {

	
	void calculateSalary(double a) {
		// TODO Auto-generated method stub
		System.out.println("manager salary : "+a);
		
	}

	
	void displayInfo(String name, double salary, int spendtime) {
		// TODO Auto-generated method stub
		System.out.println("manager name : "+name);
		System.out.println("manager salary : "+salary);
		System.out.println("manager spendtime : "+spendtime);
	}
	
}
class Programmer  extends Employee {

	
	void calculateSalary(double a) {
		// TODO Auto-generated method stub
		System.out.println("Programmer cureent salary : "+a);
		
	}

	
	void displayInfo(String name, double salary, int spendtime) {
		// TODO Auto-generated method stub
		System.out.println("Programmer name : "+name);
		System.out.println("Programmer salary : "+salary);
		System.out.println("Programmer spendtime : "+spendtime);
	}
	
}



public class Ab5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager  obj=new Manager ();
		
		obj.calculateSalary(20030);
		obj.displayInfo("pavan", 3224455, 67);
		
		Programmer  ob1=new Programmer ();
		ob1.calculateSalary(348894);
		ob1.displayInfo("kumar", 2994842, 68);

	}

}
