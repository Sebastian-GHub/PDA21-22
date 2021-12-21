package Blatt8;

public class TestingStarDatabase {

	public static void main(String[] args) {
		Star s1 = new Star();
		Star s2 = new Star();
		Star s3 = new Star();
		Star[] starArr = {s1, s2 , s3};
		
		StarsDatabase sb = new StarsDatabase(starArr);
		
		System.out.println(sb.size());
		Star s4 = new Star();
		
		sb.add(s4);
		System.out.println(sb.size());
		sb.remove(3);
		System.out.println(sb.size());
	}

}
