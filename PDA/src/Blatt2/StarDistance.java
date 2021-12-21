package Blatt2;

public class StarDistance {

	public static void main(String[] args) {
		long d1 = 8L;
		long d12 =3L; // Wir wissen beide Zahlen sind Multipliziert mit 10^18, 
		//also können wir beim Ergebnis einfach 18 Nullen ranhängen
		long d2 = d1 + d12;
		System.out.println(d2+"000000000000000000");
	}

}
