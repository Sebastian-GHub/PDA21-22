package Blatt2;

import java.util.Scanner;

public class Kostenberechnung {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Anzahl Downloads >=0: ");
		int gew�nschteCDs = scanner.nextInt();
		scanner.close();
		double kosten = 0.0;
		
		if (gew�nschteCDs>35) {
			//Werden mehr als 35 CDs gekauft gibt's 5 geschenkt und 30 zum Preis von 20 Cent
			//alle weiteren Kosten 15 Cent
			gew�nschteCDs -= 35;
			kosten = gew�nschteCDs * 0.15 + 30*0.2;
		}else if (gew�nschteCDs>5) {
			//Falls zwischen 6 und 35 CDs gekauft werden gibt's 5 geschenkt und der Rest zum Preis von 20
			//Je CD
			gew�nschteCDs -=5;
			kosten = gew�nschteCDs * 0.2;
		}
		//Werden weniger als 5 gekauft gibt's sie Geschenkt, demnach keine Rechnung n�tig
		System.out.println("Kosten = "+ kosten +" Euro");
		
	}

}
