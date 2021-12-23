package Blatt9;

public class TireSet {
	private Tire[] tires;
	
	public TireSet(Tire[] tires) {
		if(tires.length >=3 && tires.length<=5) {
			this.tires = tires;
		}
	}
	
	public int getAmount() {
		return this.tires.length;
	}
	
	public void swapTire(int index, Tire other) {
		if(duplicate(other)) {
			int otherIndex = getIndex(other);
			Tire temp = this.tires[index];
			this.tires[index] = this.tires[otherIndex];
			this.tires[otherIndex] = temp;
		}else {
			this.tires[index] = other;
		}
	}
	
	private boolean duplicate(Tire other) {
		for(Tire s : tires) {
			if(s.equals(other)) {
				return true;
			}
		}
		return false;
	}
	
	private int getIndex(Tire tire) {
		for (int i = 0; i<getAmount(); i++) {
			if(tires[i].equals(tire)) {
				return i;
			}
		}
		return -1;
	}
}
