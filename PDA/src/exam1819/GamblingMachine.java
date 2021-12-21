package exam1819;

public class GamblingMachine {
	private int balance = 0;
	
	public void insertCoins(int balance) {
		this.balance = this.balance+balance;
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	private void setBalance(int balance) {
		this.balance = balance;
	}
	
	public int withdraw() {
		int oldBal = this.balance;
		this.balance = 0;
		return oldBal;
	}
	
	public boolean play() {
		int rndm1 = (int)(Math.random()*6);
		int rndm2 = (int)(Math.random()*6);
		if (rndm1 == rndm2) {
			this.setBalance(3*this.getBalance());
			return true;
		}else {
			this.setBalance(0);
			return false;
		}
		
	}
}
