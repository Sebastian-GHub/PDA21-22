package Blatt9;

public class Cars {

	public static void main(String[] args) {
			Tire a1 = new Tire(2, false);
			Tire a2 = new Tire(2, false);
			Tire a3 = new Tire(2, false);
			Tire a4 = new Tire(2, false);
			Tire[] aArr = {a1, a2, a3, a4};
			TireSet a = new TireSet(aArr);
			
			Engine engine = new Engine(150);
			
			Trunk t = new Trunk();
			t.setVolume(200);
			
			Car c1  = new Car(2, 3, 240, a, t, engine);
			
			Car c2  = new Car(2, 3, 240, a, t, engine);
			
			System.out.println(c1.isFaster(c2));
			
			TireSet ts1 = c1.getTireSet();
			c1.swapTire(0, a4);

	}

}
