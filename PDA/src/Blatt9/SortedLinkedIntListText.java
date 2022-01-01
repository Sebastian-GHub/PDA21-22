package Blatt9;

public class SortedLinkedIntListText {

	public static void main(String[] args) {
		SortedLinkedIntList list = new SortedLinkedIntList();
		list.add(5);
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(9);
		list.add(10);
		list.add(-1);
		list.reset();
		System.out.println("Size: "+list.getSize());
		list.reset();
		int[] arr = list.toArray();
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
