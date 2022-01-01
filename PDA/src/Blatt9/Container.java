package Blatt9;

public class Container {
	private int maxWeight;
	private int size = 0;
	private int weight;
	private ContainerElement start;
	
	public Container(int maxWeight) {
		this.maxWeight =  maxWeight;
	}
	
	public int size() {
		return this.size;
	}
	
	public int getWeight() {
		return this.weight;
	}
	
	
	public void clear() {
		start = null;
		size = 0;
		weight = 0;
	}
	
	/**
	 * Adds a Package to container, if there's still enough space (weight) free.
	 * @param value Package to add.
	 * @return true if package was added, false if it wasn't.
	 */
	public boolean add(Package value) {
		if(value.getWeight()+this.weight > this.maxWeight) {
			return false;
		}else {
			ContainerElement newest = new ContainerElement(start, value);
			start = newest;
			size++;
			weight += value.getWeight();
			return true;
		}
	}
	
	/**
	 * 
	 * @param values pre-sorted array of Packages sorted by weight, first being the heaviest, last being the lightest.
	 */
	public void addOpt(Package[] values) {
		for(Package value : values) {
			add(value);
		}
	}

}
