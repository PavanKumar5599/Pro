package demopage;

public class Main_cls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Child_cls tr=new Child_cls(20,30,"Pavan","Pavan@gmail.com");
		
		Child_cls tr=new Child_cls();
		
		tr.setLength(1000);
		tr.setBreadth(50);
		
		tr.setName("pavan kumar");
		tr.setMail("pavan1325@gmail.com");
		
		int a=tr.getLength();
		int b=tr.getBreadth();
		
		int area=a*b;
		int add=a+b;
		int sub=a-b;
		
		System.out.println(add);
		System.out.println(sub);
		
		System.out.println(tr.height);
		tr.height=10;
		System.out.println(tr.height);
		System.out.println(area);
		System.out.println(tr.getName());
		System.out.println(tr.getMail());
		
		

	}

}
