package homework;

public class Account {
	
	static final float FEE = 5000f;
	static final float MIN_BALANCE = 50000f;
	protected int id;
	protected String name;
	protected float balance;
	
	public Account() {
		System.out.println("Account default called ");
		balance = MIN_BALANCE;
	}
	
	public Account(int id,String name,float balance ) {
		this.id = id;
		this.name = name;
		if (balance > 50000f) {
			this.balance =balance; 
		} else {
			this.balance = MIN_BALANCE;
		}
	}
	
	public void deposit(float amount) {
		balance+=amount;
	}
	
	public void withdraw(float amount) {
		if (balance >= amount+FEE) {
			balance-=(amount+FEE);
		} else {
			System.out.println("Not enough money");
		}
	}
	
	public void getInfo() {
		System.out.println("User: "+name);
		System.out.println("Id: "+id);
		System.out.println("Balance: "+balance);
	}
}
