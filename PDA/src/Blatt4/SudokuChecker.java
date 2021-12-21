package Blatt4;

public class SudokuChecker {

	public static void main(String[] args) {
		int [][] sudoku = new int [][] {
			{ 0 , 9 , 0 , 0 , 0 , 0 , 1 , 1 , 0 } ,
			{ 8 , 0 , 4 , 0 , 2 , 0 , 3 , 0 , 7 } ,
			{ 0 , 6 , 0 , 9 , 0 , 7 , 0 , 2 , 0 } ,
			{ 0 , 0 , 5 , 0 , 3 , 0 , 1 , 0 , 0 } ,
			{ 0 , 7 , 0 , 5 , 0 , 1 , 0 , 3 , 0 } ,
			{ 0 , 0 , 3 , 0 , 9 , 0 , 8 , 0 , 0 } ,
			{ 0 , 2 , 0 , 8 , 0 , 5 , 0 , 6 , 0 } ,
			{ 1 , 0 , 7 , 0 , 6 , 0 , 4 , 0 , 9 } ,
			{ 0 , 3 , 0 , 0 , 0 , 0 , 0 , 8 , 0}
		};
		checkRows(sudoku);
		checkColumn(sudoku);
		createSubSquare(sudoku);

	}
	//pr�fe alle Zeilen des Sudoku-Feldes
	private static void checkRows(int[][] sudoku) {
		//F�r jede Zeile
		for (int i=0; i<9;i++) {
			//Pr�fe jede Spalte
			for (int j=0; j<8; j++) {
				//mit allen folgenden Spalten-Werten
				for (int k=j; k<8; k++) {
					//Darauf ob sie identisch (und ungleich 0) sind
					if (k!=j && sudoku[i][j]==sudoku[i][k] && sudoku[i][j]!=0) {
						System.out.println("Duplicate Number '"+sudoku[i][j]+"' in row "+i+".");
					}
				}
			}
		}
	}
	//Pr�fe alle Spalten des Sudoku-Feldes
	private static void checkColumn(int[][] sudoku) {
		//F�r jede Spalte
		for (int j=0; j<9;j++) {
			//Pr�fe jede Zeile
			for (int i=0; i<8; i++) {
				//mit allen folgenden Zeilen-Werten
				for (int k=i; k<8; k++) {
					//Darauf ob sie identisch (und ungleich 0) sind
					if (k!=i && sudoku[i][j]==sudoku[k][j] && sudoku[i][j]!=0) {
						System.out.println("Duplicate Number '"+sudoku[i][j]+"' in column "+j+".");
					}
				}
			}
		}
	}
	
	//Gibt die einzelnen Felder (0-8) als eindimensionales Array aus
	private static void createSubSquare(int[][] sudoku) {
		//F�r je alle 9 Unterfelder
		for (int square = 0; square<9; square++) {
			//Lege ein eindimensionales Array an und einen Z�hler der die n�chste Stelle des Arrays festlegt
			int[] helpSquare = new int[9];
			int counter=0;
			
			//F�r bestimmte Unterfelder haben die einzelnen Zahlenfelder verschiedene Indizes, wird hierdurch geregelt
			int j = square%3*3;
			int i = 0;
			if (square>2 && square <6) {
				i=i+3;
			}else if(square>5) {
				i=i+6;
			}
			//�ber diese Indizes laufen wir
			for (int i2=i; i2<i+3 ;i2++) {
				for (int j2 = j; j2<j+3; j2++) {
					//Und schreiben die Werte aus dem kompletten Feld an die zugeh�rige Counter stelle des einzelnen Feldes im
					//1 dimensionalen Array
					helpSquare[counter]=sudoku[i2][j2];
					counter++;
				}
			}
			//checkSubSquare pr�ft das eindimensionale Array auf doppelte Werte und gibt in Kombination mit dem
			//zugeh�rigen Feld gefundene Duplikate aus
			checkSubSquare(helpSquare, square);
		}
		
	}
	//Pr�ft das eindimensionale Array auf doppelte Werte au�er der 0
	private static void checkSubSquare(int[] row, int square) {
		//Prinzipiell genau wie checkRows 
		int length = row.length;
		for (int i=0; i<length; i++) {
			for (int j=i; j<length; j++) {
				if(row[i]!=0 && j!=i && row[i]==row[j]) {
					System.out.println("Duplicate Number '"+row[i]+"' in square "+square+".");
				}
			}
		}
	}
	
	
}
