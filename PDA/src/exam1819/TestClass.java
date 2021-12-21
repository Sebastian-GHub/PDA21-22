package exam1819;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		GamblingMachine machine = new GamblingMachine();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Einwerfen: ");
		machine.insertCoins(scanner.nextInt());
		System.out.println(machine.getBalance());
		
		if (machine.play()) {
			System.out.println("gewonnen");
		}else {
			System.out.println("verloren");
		}
		System.out.println("Guthaben = "+ machine.getBalance());
		
		int money = machine.withdraw();
		
		System.out.println("Du hast "+ money +"€ ausgezahlt.");
		scanner.close();
	}

}
