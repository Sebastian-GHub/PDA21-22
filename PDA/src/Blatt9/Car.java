package Blatt9;

public class Car {
	private int seats;
	private int doors;
	private int topSpeed;
	private TireSet tires;
	
	public Car(int seats, int doors, int topSpeed, TireSet tires) {
		this.seats = seats;
		this.doors = doors;
		this.topSpeed = topSpeed;
		this.tires = tires;
	}
	public int getSeats() {
		return seats;
	}
	public void setSeats(int seats) {
		this.seats = seats;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public int getTopSpeed() {
		return topSpeed;
	}
	
	public boolean isFaster(Car other) {
		if(this.topSpeed<=other.getTopSpeed()) {
			return false;
		}else {
			return true;
		}
	}
	
	public boolean swapTire(int index, Tire other) {
		if(index >= tires.getAmount()) {
			return false;
		}else {
			tires.swapTire(index, other);
			return true;
		}
	}
	
}
