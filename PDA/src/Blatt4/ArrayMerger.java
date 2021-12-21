package Blatt4;

public class ArrayMerger {

	public static void main(String[] args) {
		int[] array1 = { 1 , 3 , 3 , 5 , 6 , 9 };
		int[] array2 = { 2 , 3 , 5 , 7 , 8 , 9 , 10 };
		int[] result ;// merge array1 and array2
		//Test comment for github
		int test = 1;
		//Addiere die L�nge der beiden Arrays und setzte result als Array mit der L�nge dieser Summe
		int arrayLength = array1.length + array2.length;
		result = new int[arrayLength]; 
		
		//Index Variablen deklariert
		int index1 = 0;
		int index2 = 0;
		
		for (int i=0; i <result.length; i++) {
			//Falls unsere Indizes noch kleiner gleich der L�nge minus 1 (Array beginnt bei 0 zu z�hlen)
			//Dann vergleiche Array1 und Array2 an ihren jeweiligen Indizes und schreibe den kleineren Wert in das L�sungsarray
			if(index1<=array1.length-1 && index2<=array2.length-1) {
				if(array1[index1]<=array2[index2]) {
					result[i] = array1[index1];
					index1++;
				}else {
					result[i] = array2[index2];
					index2++;
				}
			//Falls wir ein Array schon vollst�ndig durch haben (eben wenn die Indizes so gro� wie die L�nge sind)
			//Dann schreibe einfach nur noch die Werte des anderen Arrays in das L�sungsarray
			}else if(index1==array1.length) {
				result[i] = array2[index2];
				index2++;
			}else if(index2==array2.length) {
				result[i] = array1[index1];
				index1++;
			}
			//Gebe die Werte des L�sungsarrays hintereinander in einer Zeile aus
			System.out.print(result[i]+" ");
		}

	}

}
