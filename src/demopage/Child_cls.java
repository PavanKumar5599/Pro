package demopage;

public class Child_cls extends Parent_cls {
	 private String name; 
	   private String mail; 

	 
//	 Child_cls(int length,int breath,String name, String mail)
//	 {
////	super(length,breath);
//	super.setLength(length);
//	super.setBreadth(breath);
//	  this.name = name; 
//	  this.mail = mail; 
//	 } 

	public String getName()
	{ 
	 return name; 
	} 
	public String getMail()
	{ 
	 return mail; 
	} 
	public void setName(String name )
	{ 
	 this.name = name; 
	} 
	public void setMail(String mail)
	{ 
	 this.mail = mail; 
	 } 

}
