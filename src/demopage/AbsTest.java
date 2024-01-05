package demopage;


public class AbsTest extends cls 
	{ 
	   AbsTest()
	   { 
	      System.out.println("AbsTest class constructor"); 
	   } 

	// Implementation of abstract method in the subclass.
	   void msg()
	   { 
	      System.out.println("Hello Java"); 
	   } 
	public static void main(String[] args) {
		AbsTest ob=new AbsTest();
		System.out.println(ob.x);
		ob.msg();
		ob.m1();
		ob.m2();
		ob.m3();
	}
}
