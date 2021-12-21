package Blatt8;

public class Star {
	private String name = "";
	private String id = "";
	private double distance = 0.0;
	private double apparentMagnitude = 0.0;
	private String type = "";
	
	public Star() {
		
	}
	
	public Star(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setDistance(double distance) {
		this.distance = distance;
	}
	
	public double getDistance() {
		return this.distance;
	}
	
	public void setApparentMagnitude(double apparentMagnitude) {
		this.apparentMagnitude = apparentMagnitude;
	}
	
	public double getApparentMagnitude() {
		return this.apparentMagnitude;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
	
	public boolean isCloserThan(Star other) {
		if(this.distance < other.getDistance()) {
			return true;
		}else {
			return false;
		}
	}
	
	public double getDistanceInPC() {
		return this.distance / 3.26;
	}
	
	public double getAbsoluteMagnitude() {
		double absolute = this.apparentMagnitude - 5 * Math.log10(this.getDistanceInPC()) + 5;
		return absolute;
	}
	
	public boolean checkType() {
		double aMag = this.getAbsoluteMagnitude();
		if(aMag<=20 && aMag>=15 && this.type.equals("Brown dawrf")) {
			return true;
		}else if(aMag<=15 && aMag>=10 && (this.type.equals("Red dwarf")|| this.type.equals("White dwarf"))) {
			return true;
		}else if(aMag<=10 && aMag>=5 && this.type.equals("Subdwarf")) {
			return true;
		}else if(aMag<=5 && aMag>=0 && (this.type.equals("Main sequence") || this.type.equals("Subgiant"))) {
			return true;
		}else if(aMag<=0 && aMag>=-5 && (this.type.equals("Giant") || this.type.equals("Bright giant"))) {
			return true;
		}else if(aMag<=-5 && aMag>=-10 && (this.type.equals("Blue supergiant") || this.type.equals("Yellow supergiant") || this.type.equals("Red supergiant") || this.type.equals("Hypergiant"))) {
			return true;
		}
		return false;
	}

}
