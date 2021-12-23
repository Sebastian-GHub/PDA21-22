package Blatt9;

public class SortedLinkedIntList {
	private LinkedIntListElement start;
	private LinkedIntListElement iterCurrent;
	
	public void add(int value) {
		LinkedIntListElement elem = new LinkedIntListElement(value);
		if(start == null) {
			start = elem;
		}else {
			/*TODO:
			 * Adding elements at the right position so they do be sorted.
			 */
		}
	}
	
	public void reset() {
		iterCurrent = start;
	}
	
	public Integer getNext() {
		Integer value = iterCurrent.getValue();
		iterCurrent = iterCurrent.getNext();
		return value;
	}
	
	public boolean hasNext() {
		return iterCurrent != null;
	}
	
	public int[] toArray() {
		int size=0;
		while(hasNext()) {
			size++;
			getNext();
		}
		int[] result = new int[size];
		reset();
		for(int i=0; i<size;i++) {
			result[i] = getNext();
		}
		return result;
	}
}
