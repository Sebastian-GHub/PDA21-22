package Blatt8;

public class Cube {
	private double edgeLength;
	
	/**
	 * Create a cube
	 * @param edgeLength describes the edge length.
	 */
	public Cube(double edgeLength) {
		this.edgeLength = edgeLength;
	}
	/**
	 * Calculate the cubes surface area using the formula 6* (edgeLength)squared 
	 * @return the cubes surface area.
	 */
	public double getSurfaceArea() {
		return 6.0* Math.pow(this.edgeLength, 2);
	}
	
	public double getVolume() {
		return Math.pow(this.edgeLength, 3);
	}
	
	public void change(double increment) {
		this.edgeLength = this.edgeLength + increment;
	}
}
