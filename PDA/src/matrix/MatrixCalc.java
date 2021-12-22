package matrix;

public class MatrixCalc {
	public static void main(String[] args) {
		double[][] matrixA = {
				{1,1,1},
				{2,2,2}
		};
		double[][] matrixB = {
				{1,2},
				{1,2},
				{1,2}
		};
		double[][] matrixC = multiplyMatrix(matrixA, matrixB);
		printMatrix(matrixC);
	}
	
	public static double[][] multiplyMatrix(double[][] a, double[][] b) {
		int aRows = a.length;
		int aCol = a[0].length;
		int bRows = b.length;
		int bCol = b[0].length;
		//test if multiplication is possible.
		//multiplication is possible if a columns equals b rows.
		if(aCol==bRows) {
			/*multiply, but check whether matrix entries are all set, if not multiplication is not possible.
			 *matrix entries set = the array only holds arrays of the same size
			 *initialize solution matrix if rectangularCheck stays true.
			 */
			boolean rectangularCheck = true;
			for(int j = 1; j<aRows; j++) {
				if(a[j].length!=a[0].length || b[j].length!=b[0].length) {
					rectangularCheck = false;
				}
			}
			if(rectangularCheck) {
				double[][] solution = new double[aRows][bCol];
				for (int row = 0; row < aRows; row++) {
					for (int col = 0; col < bCol; col++) {
						for (int entry = 0; entry < bRows; entry++) {
							solution[row][col] += a[row][entry] * b[entry][col];
						}
					}
				}
				return solution;
			}else {
				double[][] solution = {{}};
				return solution;
			}
			/*
			 *matrix entries are calculated the following way:
			 *Entry at row i column j equals sum over each entry of aRow multiplied with bCol
			 */
			
		}else {
			double[][] solution = {{}};
			return solution;
		}
	}
	
	public static void printMatrix(double[][] a) {
		int rows = a.length;
		int col = a[0].length;
		if (rows== 0 || col == 0) {
			System.out.println("Matrix can't get printed since rows or columns are 0.");
		}else {
			for(int j = 0; j < rows; j++) {
				if(j!=0) {
					System.out.println();
				}
				for(int k = 0; k < col; k++) {
					System.out.print(a[j][k]+" ");
				}
			}
		}
	}
}
