package Blatt5;
/*a) Schritt 1) prüfe ob die Matrizen multipliziert werden können (falls nein gebe Fehlermeldung aus)
 *  Schritt 2) Lese die erste Zeile der linken Matrix 
 *  Schritt 3) Lese die erste Spalte der rechten Matrix
 *  Schritt 4) Multipliziere Komponentenweise 
 *  Schritt 5) Addiere die Ergebnisse
 *  Schritt 6) Schreibe das Ergebnis an die Stelle Zeile/Spalte der Ergebnis Matrix
 *  Schritt 7) wiederhole ab 2 für verbleibende Zeilen
 *  Schritt 8) Wiederhole ab 2 für verbleibende Spalten
 *  Schritt 9) Gebe die Ergebnis-Matrix aus
 */


public class Matrix {
	public static void main (String[] args) {
		double[][] a = new double[][] {{2,1,7,8},{3,0,3,9},{8,1,2,6}};
		double[][] b = new double[][] {{4,2,5},{7,1,7},{5,2,3},{1,1,0}};
		
		//falls Multiplikation möglich führe sie aus,
		if(multiplicationPossible(a,b)) {
			multiplyMat(a,b);
		//sonst gebe einen Fehler aus
		}else {
			System.out.println("Multiplikation ist nicht möglich");
		}
	}
	
	//Methode um Matrizen zu multiplizieren.
	private static void multiplyMat(double[][] a, double[][] b) {
		int aRows = a.length;
		int aColumns = a[0].length;
		int bRows = b.length;
		int bColumns = b[0].length;
		//Erstellt die Lösungsmatrix mit: Zeilen von A x Spalten von B
		double[][] c = new double[aRows][bColumns];
		
		
		for (int i=0; i<aRows;i++) {
			for (int j=0; j<bColumns; j++) {
				for (int k=0; k<b.length;k++) {
					c[i][j]=c[i][j] + a[i][k]*b[k][j];
				}
			}
		}
		//Gebe die Ergebnis-Matrix aus
		printMatrix(c);
	}
	
	//Trivial
	public static void printMatrix(double[][] c) {
		for (int zeile=0; zeile<c.length;zeile++) {
			for (int spalte=0; spalte<c[0].length; spalte++) {
				System.out.print(c[zeile][spalte]+" ");
			}
			System.out.println();
		}
	}
	
	private static boolean multiplicationPossible(double[][] a, double[][] b) {
		//Prüfe Spaltenzahl von a
		int columns= a[0].length;
		//Prüfe Zeilenanzahl von b
		int rows = b.length;
		//Wenn multiplikation möglich, return true, sonst false.
		if (rows==columns) {
			return true;
		}else {
			return false;
		}
	}
}

