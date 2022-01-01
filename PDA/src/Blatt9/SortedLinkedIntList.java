package Blatt9;

public class SortedLinkedIntList {
	private LinkedIntListElement start;
	private LinkedIntListElement iterCurrent;
	
	public void add(int value) {
		LinkedIntListElement elem = new LinkedIntListElement(value);
		if(start == null) {
			start = elem;
		}else {
			if(start.getValue()>=value) {
				elem.setNext(start);
				start = elem;
			}else {
				LinkedIntListElement tmp = start;
				LinkedIntListElement tmpPrevious = start;
				boolean set = false;
				while(tmp.getValue()<value) {
					if(tmp.hasNext()) {
						tmpPrevious = tmp;
						tmp = tmp.getNext();
					}else {
						tmp.setNext(elem);
						set = true;
					}	
				}
				if(!set) {
					elem.setNext(tmp);
					tmpPrevious.setNext(elem);
				}			
			}
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
		int size = getSize();
		int[] result = new int[size];
		LinkedIntListElement arrElem = start;
		for(int i=0; i<size;i++) {
			result[i] = arrElem.getValue();
			arrElem = arrElem.getNext();
		}
		return result;
	}
	
	public int getSize() {
		int size = 0;
		if(start!=null) {
			size++;
		}
		LinkedIntListElement sizeCounter = start;
		while(sizeCounter.hasNext()) {
			size++;
			sizeCounter = sizeCounter.getNext();
		}
		return size;
	}
}
