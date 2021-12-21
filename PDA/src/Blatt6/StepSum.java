package Blatt6;

public class StepSum {
	public static void main (String[] args) {
        int[] array = { 2, 4, 1, 3, 7 };
        stepSum(array);
        //stepSumRightAligned(array);
    }


    public static void stepSum(int[] arr) {
        if (arr.length==1) {
            System.out.println(arr[0]);
        }else {
            int newLength = arr.length;
            int[] newArr = new int[newLength-1];
            for (int i = 0; i<arr.length-1; i++) {
                newArr[i] = arr[i]+arr[i+1];
            }
            stepSum(newArr);
            for (int i : arr) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
