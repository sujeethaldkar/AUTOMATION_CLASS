package encapsulation;

public class Bank {

	private int balance;
	private String cuustomerName;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance>1000)
		this.balance = balance+150;
	 else if(balance<1000)
	
		this.balance = balance-500;
	}
	public String getCuustomerName() {
		return cuustomerName;
	}
	public void setCuustomerName(String cuustomerName) {
		this.cuustomerName = cuustomerName;
	}
}
