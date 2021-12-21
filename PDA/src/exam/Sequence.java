package exam;

public class Sequence {
	public static final int end = 100;
	
	public static void main(String[] args) {
		int number = 1;
		System.out.println(number);
		int step = 0;
		int i = 0;
		while (number!=end && number < end) {
			step = (2*i+1)*(int)Math.pow(-1, i);
			number = number + step;
			i++;
			if (number<=end) {
				System.out.println(number);
			}
		}
		
	}
}
