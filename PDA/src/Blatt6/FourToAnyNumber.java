package Blatt6;

import java.util.Scanner;

public class FourToAnyNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Zahl (> 0): ");
		int input = scanner.nextInt();
		solve(input);
		scanner.close();
	}
	
	public static void solve(int val) {
		if (val<0) {
			System.out.println("Eingabe muss größer als 0 sein.");
		}else if (val == 4) {
			System.out.println("4");
		}else {
			String input = ""+val;
			String result = "";
			int length = input.length();
			char lastDigit = input.charAt(length-1);
			char[] chars = input.toCharArray();
			int val2 = 0;
			if (lastDigit == '0' || lastDigit== '4') {
				for (int i = 0 ; i<length-1;i++) {
					result = result + chars[i];
					val2 = Integer.parseInt(result);
				}
			}else {
				val2 = val * 2;
			}
			solve(val2);
			System.out.println(val);
		}
		
	}

}
