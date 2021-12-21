package Blatt1;

public class Potenz {

	public static void main(String[] args) {
		int a = 2;
		int b = 4;
		int result = 1;
		while (b>0) {
			result = result * a;
			b = b-1;
		}
		System.out.println(result);
	}

}
