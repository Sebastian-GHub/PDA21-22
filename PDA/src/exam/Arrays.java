package exam;

public class Arrays {
	
	public static void main(String[] args) {
		int[] arr = {-5,2,-9};
		System.out.println(addMinMax(arr));
		int[] rev = reverse(arr);
		for (int i =0; i<arr.length;i++) {
			System.out.print(rev[i]);
		}
	}
	
	public static int[] reverse(int[] values) {
		int length = values.length;
		if (length == 0) {
			return values;
		}
		int[] arr = new int[length];
		for (int i = 0; i<length; i++) {
			arr[i] = values[(length-1)-i];
		}
		return arr;
	}
	
	public static int addMinMax(int[] values) {
		int length = values.length;
		if (length==0) {
			return 0;
		}else if(length==1) {
			return values[0]*2;
		}else {
			int max = values[0];
			int min = values[0];
			for (int i = 0; i<length; i++) {
				if(values[i]> max) {
					max = values[i];
				}
				if(values[i]<min) {
					min = values[i];
				}
			}
			return max+min;
		}
	}
}
