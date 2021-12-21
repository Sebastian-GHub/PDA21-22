package Blatt8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AccountTest {
	@Test
	public void testTransferOverFunded() {
		Account a1 = new Account();
		a1.setOwner("Donald Duck");
		Account a2 = new Account();
		a2.setOwner("Scrooge McDuck");
		a1.deposit(150);
		assertEquals(true, a1.transfer(50, a2));
		assertEquals(100, a1.getBalance());
		assertEquals(50, a2.getBalance());
	}
	
	@Test
	public void testTransferFunded() {
		Account a1 = new Account();
		a1.setOwner("Donald Duck");
		Account a2 = new Account();
		a2.setOwner("Scrooge McDuck");
		a1.deposit(100);
		assertEquals(true, a1.transfer(50, a2));
		assertEquals(50, a1.getBalance());
		assertEquals(50, a2.getBalance());
	}
	
	@Test
	public void testTransferUnderFunded() {
		Account a1 = new Account();
		a1.setOwner("Donald Duck");
		Account a2 = new Account();
		a2.setOwner("Scrooge McDuck");
		a1.deposit(40);
		assertEquals(false, a1.transfer(50, a2));
		assertEquals(40, a1.getBalance());
		assertEquals(0, a2.getBalance());
	}
}
