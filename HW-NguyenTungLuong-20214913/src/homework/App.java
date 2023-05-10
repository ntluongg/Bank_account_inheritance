package homework;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 = new Account(1,"luong1",10000000f);
		Saving_Account account2 = new Saving_Account(1,"luong2",100000f);
		account1.getInfo();
		account2.getInfo();
		account2.getMonthlyInterest();
	}
}
