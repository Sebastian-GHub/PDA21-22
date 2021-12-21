package exam1819;

public class gnomeSort {
	public static void main(String[] args) {
		int[] arr = {9,5,6,7,2,3,4,6};
		gnomeSort2(arr);
		for (int i : arr) {
			System.out.print(i);
		}
	}
	public static void gnomeSort2(int[] values) {
		if (values.length==0||values.length==1) {
			
		}else {
			int i = 0;
			while (i < values.length) {
				if (i==0) {
					i++;
				}else if(values[i-1]<=values[i]) {
					i++;
				}else if(values[i-1]>values[i]) {
					int temp = values[i];
					values[i]=values[i-1];
					values[i-1]= temp;
					i--;
				}
					
				
			}
		}
	}

}
