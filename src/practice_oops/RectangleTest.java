package practice_oops;

class Rectan 
{
// Declare instance variables as private in the class. 
   private int length; 
   private int breadth; 

// Declare a constructor Rectangle and define parameters of constructor. 
 Rectan(int length,int breadth)
 { 
	 this.length=length;
  this.breadth = breadth; 
 } 
 
 
// Create a getter method for each private variable. 

public int getBreadth()
{ 
 return breadth; 
} 
public int getLength()
{ 
 return length; 
}

//2 privete constuctor find the squre of numbers

// Create a setter method for each private variable and define parameter. 
public void setLength(int length)
{ 
 this.length = length; 
} 
public void setBreadth(int breadth)
{ 
 this.breadth = breadth; 
} 
}

public class RectangleTest 
{ 
public static void main(String[] args)
{ 
Rectan rt = new Rectan(30,23); 

float lth = rt.getLength(); 
int bth = rt.getBreadth(); 


float Area = lth * bth; 
System.out.println("Area: " +Area); 

rt.setBreadth(66); 
rt.setLength(34);

int ln = rt.getLength(); 
int br = rt.getBreadth(); 
int newArea = ln * br; 
System.out.println("New area: " +newArea); 
} 
}
