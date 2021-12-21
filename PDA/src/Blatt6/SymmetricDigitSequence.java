package Blatt6;

public class SymmetricDigitSequence {

	public static void main(String[] args) {
		System.out.println(symmetricDigitSequence(6));
		System.out.println(symmetricDigitSequenceRec(9));

	}
	
	public static String symmetricDigitSequence(int max) {
        if (max < 0) {
            return "Bitte positive Eingabe";
        }
        String result = "0";
        for (int i = 1; i<max+1; i++) {
        	result = i + result + i;
        }
        return result;
    }
    
    public static String symmetricDigitSequenceRec(int max) {
    	if (max < 0) {
            return "Bitte positive Eingabe";
        }
        if (max == 0) {
        	return "0";
        }
        return max +symmetricDigitSequenceRec(max-1)+ max;
    }
    
}
