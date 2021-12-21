package Blatt8;

public class StarsDatabase {
	
	private Star[] starArr = {};
	
	public StarsDatabase(Star[] starArr) {
		this.starArr = starArr;
	}
	
	public StarsDatabase() {
	}
	
	public Star[] getStarrArr() {
		return this.starArr;
	}
	
	public void setStarrArr(Star[] starArr) {
		this.starArr = starArr;
	}
	
	public void add(Star star) {
		Star[] newStarArr = new Star[this.starArr.length+1];
		newStarArr[starArr.length] = star;
		this.starArr = newStarArr;
	}
	
	public void remove(int index) {
		if(index<0||index>=starArr.length) {
			System.out.println("There is no star for the given index.");
		}else {
			Star[] newStarArr = new Star[this.starArr.length-1];
			for (int i = 0; i<this.starArr.length; i++) {
				if (i>= index) {
					newStarArr[i]=this.starArr[i+1];
				}else {
					newStarArr[i]=this.starArr[i];
				}
			}
		}
	}
	
	public Star get(int index) {
		if(index<0||index>=starArr.length||starArr[index]==null) {
			System.out.println("There is no star for the given index.");
			return null;
		}else {
			return this.starArr[index];
		}
	}
	
	
	
	public int size() {
		return this.starArr.length;
	}
	
	public Star find(String id) {
		for (Star s : this.starArr) {
			if (s.getId().equals(id)) {
				return s;
			}
		}
		return null;
	}
	
	public Star[] getMagnitudeRange(double low, double high) {
		StarsDatabase lowHigh = new StarsDatabase();
		for (Star s : starArr) {
			if (s.getApparentMagnitude()>= low && s.getApparentMagnitude()<= high) {
				lowHigh.add(s);
			}
		}
		return lowHigh.getStarrArr();
	}
}
