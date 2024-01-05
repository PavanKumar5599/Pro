package demopage;
class Pra{
	private int num;
	private String name;
	
	Pra(int num,String name ){
		this.num=num;
		this.name=name;
	}
	
	void Print(){
		System.out.println("NUM:" +num);
		System.out.println("Name:"+name);
	}
}
class Rohit extends Pra{
	private int phone;
	private String mail;
		
	Rohit(int num,String name,int phone,String mail){
		super(num,name);
		this.phone=phone;
		this.mail=mail;
	}
	
	void Println() {
		System.out.println(phone);
		System.out.println(mail);
	}
	
}

public class En_cls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rohit obj=new Rohit(23,"Pavan",9863,"pavan@gmail.com");
		obj.Print();
		obj.Println();

	}

}
