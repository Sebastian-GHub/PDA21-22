package Blatt9;

public class Car {
	private int seats;
	private int doors;
	private int topSpeed;
	private TireSet tires;
	private Engine engine;
	private Trunk trunk;
	
	public Car(int seats, int doors, int topSpeed, TireSet tires, Trunk trunk, Engine engine) {
		this.seats = seats;
		this.doors = doors;
		this.topSpeed = topSpeed;
		this.tires = tires;
		this.engine = engine;
		this.trunk = trunk;
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
		return this.topSpeed;
	}
	
	public TireSet getTireSet() {
		return this.tires;
	}
	
	public Tire getTire(int index) {
		if(index>=this.tires.getAmount()) {
			return null;
		}
		return this.tires.getTire(index);
	}
	
	public Engine getEngine() {
		return this.engine;
	}
	
	public Trunk getTrunk() {
		return this.trunk;
	}
	
	public int getEngineSize() {
		return this.engine.getCubicCapacity();
	}
	
	public int getTrunkVolume() {
		return this.trunk.getVolume();
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
