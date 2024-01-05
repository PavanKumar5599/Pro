package practice_package;

public class Overloading_me {
	//If a class has multiple methods having same name but different in parameters, 
	//it is known as Method Overloading
	//Method overloading is achieved by either:
	////1.changing the number of arguments.
	////or 2. changing the data type of arguments.

	    // this method accepts int
	    private static void display(int a){
	        System.out.println(a);
	    }

	    // this method  accepts String object
	    private static void display(String a){
	        System.out.println(a);
	    }

	    public static void main(String[] args) {
	        display("pavan");
	        display(2);
	    }
	


}
