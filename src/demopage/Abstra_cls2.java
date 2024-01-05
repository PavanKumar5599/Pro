package demopage;

public class Abstra_cls2 extends Abstract_cls1{
	 //Overriding abstract method. 
	   public void msg2() 
	   { 
	      System.out.println("msg2-Test"); 
	   } 
	public static void main(String[] args)
	{ 
	 // Creating object of subclass Test. 
	    Abstra_cls2 obj = new Abstra_cls2(); 
	   obj.msg1();	
	   obj.msg2();
	  } 
	}




