package parser;

public class CrimeADT {
	
	private String id;
	private String offence;
	private String residence;
	private double longitude;
	private double latitude;
	
	public CrimeADT(String id, String offence, String residence, double longitude, double latitude) {
		this.id = id;
		this.offence = offence;
		this.residence = residence;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	
	public String getId() {
		return this.id;
	}
	
	public String getOffence() {
		return this.offence;
	}
	
	public String getResidence() {
		return this.residence;
	}
	
	public double getLongitude() {
		return this.longitude;
	}
	
	public double getLatitude() {
		return this.latitude;
	}
	
	@Override
	public String toString() {
		return "id:" + id + " offence:" + offence + " residence:" + residence + " longitutde:" + longitude + " latitude:" +latitude;
	}
	
	
	
	public int compareId(CrimeADT that) {
		if (this.id.compareTo(that.getId()) < 0)
			return -1;
		if (this.id.compareTo(that.getId()) > 0)
			return 1;
		return 0;
	}

	
	public int compareOffence(CrimeADT that) {
		if (this.offence.compareTo(that.getOffence()) < 0)
			return -1;
		if (this.offence.compareTo(that.getOffence()) > 0)
			return 1;
		return 0;
	}
	
	public int compareResidence(CrimeADT that) {
		if (this.residence.compareTo(that.getResidence()) < 0)
			return -1;
		if (this.residence.compareTo(that.getResidence()) > 0)
			return 1;
		return 0;
	}
	
	public int compareLongitude(CrimeADT that) {
		if (this.longitude - (that.getLongitude()) < 0)
			return -1;
		if (this.longitude + (that.getLongitude()) > 0)
			return 1;
		return 0;
	}
	
	public int compareLatitude(CrimeADT that) {
		if (this.latitude - (that.getLatitude()) < 0)
			return -1;
		if (this.latitude + (that.getLatitude()) > 0)
			return 1;
		return 0;
	}
}
