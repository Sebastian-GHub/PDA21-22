package Blatt2;

import java.util.Scanner;

public class Ratespiel {

	public static void main(String[] args) {
		int randomNumber = (int)(Math.random()*101.0); //gibt ganze Zufallszahl zwischen 0 und 100
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zufallszahl zwischen 0 und 100 gw�hlt. M�ge das Raten beginnen");
		int eingabe = -1; //Darf nicht als Wert zwischen 0 und 100 deklariert werden, weil das m�gliche randomNumber's sind
		int versuche = 0;
		while (eingabe!=randomNumber) {
			eingabe = scanner.nextInt();
			if(eingabe>randomNumber) {				//Kleiner
				System.out.println("Zufallszahl ist kleiner!");
				versuche++;							//Versuche mitz�hlen
			}else if(eingabe<randomNumber) {		//Gr��er
				System.out.println("Zufallszahl ist gr��er!");
				versuche++;
			}else {									//Richtig geraten
				versuche++;
				System.out.println("Geschafft Zufallszahl war "+randomNumber);
				System.out.println("Anzahl an Versuchen = "+versuche);
			}
		}
		scanner.close(); 							//Am Ende Scanner schlie�en
			
	}

}
