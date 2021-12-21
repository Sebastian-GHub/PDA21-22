package Blatt8;

import java.util.Scanner;

public class SphereCube {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter an edge length >=0: ");
		double input = scanner.nextDouble();
		while(input<0) {
			System.out.print("Negative input, please enter a positive value: ");
			input = scanner.nextDouble();
		}
		Cube c = new Cube(input);
		System.out.print("Please enter a radius >=0: ");
		input = scanner.nextDouble();
		while(input<0) {
			System.out.print("Negative input, please enter a positive value: ");
			input = scanner.nextDouble();
		}
		Sphere s = new Sphere(input);
		System.out.println("Cube volume: "+c.getVolume());
		System.out.println("Sphere volume: "+s.getVolume());
		
		System.out.print("Please enter an increment >0: ");
		input = scanner.nextDouble();
		while(input<=0) {
			System.out.print("Negative input, please enter a positive value: ");
			input = scanner.nextDouble();
		}
		scanner.close();
		boolean done = false;
		while(!done) {
			if (s.getVolume()>c.getVolume()) {
				while (s.getVolume()>c.getVolume()) {
					s.change(-input);
					c.change(input);
				}
				done = true;
			}else if(c.getVolume()>s.getVolume()) {
				while (c.getVolume()>s.getVolume()) {
					s.change(input);
					c.change(-input);
				}
				done = true;
			}else {
				done = true;
			}
		}
		System.out.println("Cube volume: "+c.getVolume());
		System.out.println("Sphere volume: "+s.getVolume());
		System.out.println("Cube surface: "+c.getSurfaceArea());
		System.out.println("Sphere surface: "+s.getSurfaceArea());
		
	}
}
