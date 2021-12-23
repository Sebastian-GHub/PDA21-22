package Blatt9;

public class Tire {
	private int treadDepth;
	private boolean flat;
	
	/**
	 * 
	 * @param treadDepth
	 * @param flat
	 */
	public Tire(int treadDepth, boolean flat) {
		this.treadDepth = treadDepth;
		this.flat = flat;
	}
	public boolean isFlat() {
		return flat;
	}
	
	public void gotDamaged() {
		this.flat = true;
	}
	
	public int getTreadDepth() {
		return this.treadDepth;
	}
}
