package Blatt9;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SortedIntListTest {
	@Test
	public void testReturnArrayAndSize() {
		SortedLinkedIntList list = new SortedLinkedIntList();
		list.add(5);
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(9);
		list.add(10);
		list.add(-1);
		int[] solution = {-1,0,1,2,5,9,10};
		assertArrayEquals(solution, list.toArray());
		assertEquals(7, list.getSize());
	}
	@Test
	public void hasNextAndGetNext() {
		SortedLinkedIntList list = new SortedLinkedIntList();
		assertEquals(false, list.hasNext());
		list.add(0);
		list.reset();
		assertEquals(true, list.hasNext());
		assertEquals(0, list.getNext());
		list.add(5);
		list.reset();
		assertEquals(true, list.hasNext());
		assertEquals(0, list.getNext());
		assertEquals(true, list.hasNext());
		assertEquals(5, list.getNext());
		assertEquals(false, list.hasNext());

	}
	
	
}
