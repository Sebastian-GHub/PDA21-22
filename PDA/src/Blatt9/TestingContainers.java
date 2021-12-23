package Blatt9;

public class TestingContainers {
	public static void main(String[] args) {
		Container d = new Container(50);
		Package p1 = new Package(39);
		Package p2 = new Package(19);
		Package p3 = new Package(11);
		Package p4 = new Package(4);
		Package[] pArr = {p1, p2, p3, p4};
		d.addOpt(pArr);
		System.out.println("Weight: "+d.getWeight());
		System.out.println("Packages loaded: "+d.size());
	}
		
}
