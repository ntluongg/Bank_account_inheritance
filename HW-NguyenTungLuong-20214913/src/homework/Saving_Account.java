package homework;

public class Saving_Account extends Account{
	final static float RATE = 0.06f;
	
	public Saving_Account() {
		super();
	}
	
	public Saving_Account(int id,String name,float balance) {
		super(id,name,balance);
	}
	
	public void getMonthlyInterest() {
		System.out.println("Your monthly interest: "+(balance*RATE)/12);
	}
	
	@Override 
	public void withdraw(float amount) {
		System.out.println("You cant withdraw from saving account");
	}
}
