package Blatt5;

public class Methods {
	
	public static int min(int[] values) {
		int min = values[0];
		for (int i= 1; i<values.length; i++) {
			if (values[i]<min) {
				min = values[i];
			}
		}
		return min;
	}
	
	public static double product(double[] values) {
		double result = 1.0;
		for (int i=0; i<values.length; i++) {
			result = result * values[i];
		}
		return result;
	}
	
	public static boolean isLatinLetter(char letter) {
		int letterUnicode = letter;
		if (letterUnicode>64 && letterUnicode<91) {
			return true;
		}else if(letterUnicode>96 && letterUnicode<123) {
			return true;
		}else {
			return false;
		}
	}
	
	public static int[][] createIdentityMatrix(int size){
		int[][] matrix = new int[size][size];
		for (int i=0; i<size; i++) {
			for (int j=0; j<size; j++) {
				if (i==j) {
					matrix[i][j]= 1;
				}else {
					matrix[i][j]=0;
				}
			}
		}
		return matrix;
	}
}
