package practice_oops;

/*3.Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
 *  Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class 
 *  and implement the respective methods to handle deposits and withdrawals for each account type.
 */
abstract class BankAccount {
	
	
	
	abstract void deposit(double d);
	abstract void withdraw(double w);
	
}

class CurrentAccount  extends BankAccount {
	
	

	void deposit(double d) {
		// TODO Auto-generated method stub
		System.out.println("CurrentAccount deposit amount : "+d);
		
	}

	
	void withdraw(double w) {
		// TODO Auto-generated method stub
		System.out.println("CurrentAccount withdraw amount : "+w);
		
		
		
	}
	
}
class SavingsAccount  extends BankAccount  {
	
	
	void deposit(double d) {
		// TODO Auto-generated method stub
		System.out.println("saveing account deposit amount : "+d);
		
	}
	
	void withdraw(double w) {
		// TODO Auto-generated method stub
		System.out.println("saveing account withdraw amount : "+w);
	}
}

public class Ab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		CurrentAccount  ob=new CurrentAccount ();
		SavingsAccount  obj=new SavingsAccount ();
		ob.deposit(20000);
		ob.withdraw(30000);
		
		obj.deposit(235783);
		
		
		obj.withdraw(553773);

	}

}
