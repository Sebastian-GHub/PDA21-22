package Blatt6;

public class ArraySum {
	public static void main (String[] args) {
		int[] numbers1 = {};
        int[][] numbers2 = {{1,2,3},{1}};
        int[][][]numbers3 =  {{{1, 2}, {3}}, {{4}}};
        System.out.println(arraySum1D(numbers1));
        System.out.println(arraySum2D(numbers2));
        System.out.println(arraySum3D(numbers3));
        System.out.println(average3D(numbers3));	
	}
	
	public static int arraySum1D(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum = sum + i;
        }
        return sum;
    }


    public static int arraySum2D(int[][] numbers) {
        int sum = 0;
        for (int[] i : numbers) {
            sum = sum + arraySum1D(i);
        }
        return sum;
    }

    public static int arraySum3D(int[][][] numbers) {
        int sum = 0;
        for (int[][] i : numbers) {
            sum = sum + arraySum2D(i);
        }
        return sum;
    }

    public static double average3D(int[][][] numbers) {
        double avg = 0.0;
        int length = 0;
        for (int[][]i : numbers) {
        	for (int[]j : i) {
        		for (int k : j) {
        			length++;
        		}
        	}
        }
        if(length==0) {
            return 0;
        }else {
            avg = (double)arraySum3D(numbers)/length;
            return avg;
        }
    }
}
