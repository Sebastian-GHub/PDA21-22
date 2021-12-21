package Blatt2;

import java.util.Scanner;

public class Kostenberechnung {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Anzahl Downloads >=0: ");
		int gewünschteCDs = scanner.nextInt();
		scanner.close();
		double kosten = 0.0;
		
		if (gewünschteCDs>35) {
			//Werden mehr als 35 CDs gekauft gibt's 5 geschenkt und 30 zum Preis von 20 Cent
			//alle weiteren Kosten 15 Cent
			gewünschteCDs -= 35;
			kosten = gewünschteCDs * 0.15 + 30*0.2;
		}else if (gewünschteCDs>5) {
			//Falls zwischen 6 und 35 CDs gekauft werden gibt's 5 geschenkt und der Rest zum Preis von 20
			//Je CD
			gewünschteCDs -=5;
			kosten = gewünschteCDs * 0.2;
		}
		//Werden weniger als 5 gekauft gibt's sie Geschenkt, demnach keine Rechnung nötig
		System.out.println("Kosten = "+ kosten +" Euro");
		
	}

}
