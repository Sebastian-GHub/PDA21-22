package Blatt7;

public class TestClass {

	public static void main(String[] args) {
		Account a1 = new Account();
		Account a2 = new Account();
		a1.setOwner("Donald Duck");
		a2.setOwner("Dagobert Duck");
		a1.deposit(15);
		a2.deposit(25648.98);
		a1.deposit(7653);
		a1.withdraw(978156);
		a2.withdraw(12);
		a1.deposit(2.14);		
		
		System.out.println("Account of: "+a1.getOwner()+" has a balance of:"
				+ "\n"+a1.getBalance()
				+ "\nAccount of: "+a2.getOwner()+" has a balance of:"
				+ "\n"+a2.getBalance());
	}

}
