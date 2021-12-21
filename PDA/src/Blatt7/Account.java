package Blatt7;

public class Account {
	private final int MAX_ACCOUNT_OWNER = 5;
	private String[] owner = new String[MAX_ACCOUNT_OWNER];
	private double balance = 0.0;
	
	public void deposit(double money) {
		if (money <= 0) {
			
		}else {
			balance = balance + money;
		}
	}
	
	//withdraw money, lower your balance or decline the withdrawal
	public void withdraw(double money) {
		if (money > balance) {
			System.out.println("You can't withdraw more money than you currently have.\nYour current balance: "+balance);
		}else {
			balance = balance - money;
			System.out.println("Successfully withdrawn: "+money+".");
		}
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setOwner(String owner) {
		this.owner[0] = owner;
	}
	
	//return the first entry from owner array, if there're more entries set return them as well 
	public String getOwner() {
		String ownerList = this.owner[0];
		for (String i : this.owner) {
			if (i!=null && i!=this.owner[0]) {
				ownerList = ownerList+" and " + i;
			}
		}
		return ownerList;
	}
	/* Add and remove Owner to an existing accounts.
	 * Maximum number of owners is capped to 5
	 */
	
	public void addOwner(String owner) {
		boolean free = false;
		for (int i = 1; i<this.owner.length; i++) {
			if (this.owner[i]==null) {
				this.owner[i] = owner;
				free = true;
				break;
			}
		}
		if(!free) {
		}
	}
	
	public void removeOwner(String owner) {
		boolean removed = false;
		for (int i = 0; i<this.owner.length; i++) {
			if (!removed) {
				if (this.owner[i].equals(owner)) {
					removed = true;
					this.owner[i] = null;
				}
			}else if(removed){
				this.owner[i-1] = this.owner[i];
			}
		}
		if(removed) {
			System.out.println("Successfully removed "+owner+" as an owner.");
		}else {
			System.out.println(owner + " couldn't be removed as an owner, because they are not owning this account");
			
		}
	}
}
