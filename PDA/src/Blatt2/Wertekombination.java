package Blatt2;

public class Wertekombination {

	public static void main(String[] args) {
		int a = 1;
		long b = 2L;
		float c = 3F;
		double d = 4D;
		char e = '1';
		double sumDouble = a+b+c+d+e;
		int sumInt = (int)(a+b+c+d+e);
		System.out.println(sumDouble);
		System.out.println(sumInt);
	}

}
