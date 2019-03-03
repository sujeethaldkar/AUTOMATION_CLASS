package encapsulation;

public class User {

	public static void main(String[] args) {
		Bank obj= new Bank();
		obj.setBalance(900);
		System.out.println(obj.getBalance());
	}

}
