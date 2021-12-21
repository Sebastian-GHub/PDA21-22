package Blatt5;

public class Sterndatenbank {
	public static void main(String[] args) {
	String[] names = new String[] {"Sirius", "Alpha Centauri", "Rigel", "Almaaz", "Luhman 16"};
	String[] ids = new String[] {"TYC 5949-2777-1", "TYC 9007-5849-1", "TYC 5331-1752-1", "TYC 2907-1275-1", "WISE J1049-5319A"};
	double[] distances = new double[] {8.6, 4.37, 860, 2000, 6.589};
	//double[] apparentMagnitudes = new double[] {-1.46, -0.27, 0.13, 2.92, 14.94};
	String[] types = new String[] {"Main sequence", "Main sequence", "Blue supergiant", "Yellow supergiant", "Brown dwarf"};
	
	System.out.println("Database size: "+databaseSize(ids));
	System.out.println("ID :TYC 2907-1275-1 has index:" + idToIndex("TYC 2907-1275-1", ids));
	System.out.println("Index 1 has following name and type: "+indexToNameAndType(1, names, types));
	
	
	int max = 250;
	System.out.print("Star index with less than "+max+" distance: ");
	int[] test = indexDistanceLessThanX(max, distances);
	for (int i : test) {
		System.out.print(i+" ");
	}
	
	idSwapTypeToNewType("TYC 5949-2777-1", ids, "NEW TYPE", types);
	System.out.println("\n"+ types[0]);
	
	
	}
	public static int databaseSize(String[] ids) {
		int length = ids.length;
		return length;
	}
	
	public static int idToIndex(String id, String[] ids) {
		for (int i =0; i< ids.length; i++) {
			if (id.equals(ids[i])){
				return i;   //Gib den Index zurück an der der String id im Array ids steht.
			}
		}
		return -1; //Fehler 
	}
	
	public static String indexToNameAndType(int index, String[] names, String[] types) {
		String result = "";
		if (index < names.length) {
			result = names[index]+" ("+types[index]+")";
		}else {
			result = "Index bigger than database size";
		}
		return result;
	}
	
	public static int[] indexDistanceLessThanX(double max, double[] distances) {
		int arraySize = 0;
		int nextIndex = 0;
		for (int index =0; index< distances.length; index++) {
			if (distances[index]< max) {
				arraySize++;
			}
		}
		int[] indexArray= new int[arraySize];
		for (int index =0; index< distances.length; index++) {
			if (distances[index] < max) {
				indexArray[nextIndex] = index;
				nextIndex++;
			}
		}
		return indexArray;
	}
	
	public static String[] idSwapTypeToNewType(String id,String[] ids, String newType, String[] types) {
		int index = -1;
		for (int i=0; i<ids.length; i++) {
			if(id.equals(ids[i])) {
				index = i;
				break;
			}
		}
		if (index == -1) {
			//Bei falscher Eingabe ändere gar nichts
			return types;
		}else {
			//sonst ändere den Typen
			types[index]= newType;
			return types;
		}
		
	}
	
}
