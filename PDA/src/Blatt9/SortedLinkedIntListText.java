package Blatt9;

public class SortedLinkedIntListText {

	public static void main(String[] args) {
		SortedLinkedIntList list = new SortedLinkedIntList();
		list.add(5);
		list.add(3);
		list.add(0);
		list.reset();
		int[] arr = list.toArray();
		
		for(int i : arr) {
			System.out.println(i);
		}
	}

}
