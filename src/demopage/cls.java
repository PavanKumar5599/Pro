package demopage;

public abstract class cls {
	 int x = 10; // Data member. 
	  cls()
	  { 
	     System.out.println("AbstractClass constructor"); 
	  } 
	  final void m1()
	  { 
	     System.out.println("Final method"); 
	  } 
	  public void m2()
	  { 
	     System.out.println("Instance method"); 
	  } 
	  static void m3()
	  { 
	     System.out.println("Static method"); 
	  } 
	  abstract void msg(); // abstract method declaration.
	} 
	


