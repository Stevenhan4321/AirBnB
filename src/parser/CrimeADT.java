package parser;

public class CrimeADT {
	
	private String id;
	private String offence;
	private String residence;
	private double longitude;
	private double latitude;
	private int nodeId;
	
	/**
	 * Creates a CrimeADT object
	 * @param id - Contains Identification Number of Crime
	 * @param offence - Contains type of offence of the crime
	 * @param residence - Contains the residence of the crime
	 * @param longitude - Contains the longitude of the crime
	 * @param latitude - Contains the latitude of the crime
	 * @param nodeId - Contains the nodeId used for graphing algorithm
	 */
	public CrimeADT(String id, String offence, String residence, double longitude, double latitude, int nodeId) {
		this.id = id;
		this.offence = offence;
		this.residence = residence;
		this.longitude = longitude;
		this.latitude = latitude;
		this.nodeId = nodeId;
	}

	/**
	 * Getter Method - Returns the ID of the Crime
	 * @return String - ID of the Crime
	 */
	public String getId() {
		return this.id;
	}
	
	/**
	 * Getter Method - Returns the type of offence of the crime
	 * @return String - type of offence of the crime
	 */
	public String getOffence() {
		return this.offence;
	}
	
	/**
	 * Getter Method - Returns the residence of the crime
	 * @return String - residence of the crime
	 */
	public String getResidence() {
		return this.residence;
	}
	
	/**
	 * Getter Method - Returns the longitude of the crime
	 * @return double - longitude of the crime
	 */
	public double getLongitude() {
		return this.longitude;
	}
	
	/**
	 * Getter Method - Returns the latitude of the crime
	 * @return double - latitude of the crime
	 */
	public double getLatitude() {
		return this.latitude;
	}
	
	/**
	 * Getter Method - Returns the nodeId used for graphing algorithm
	 * @return int - nodeId used for graphing algorithm
	 */
	public int getNodeId() {
		return this.nodeId;
	}
	
	/**
	 * Return the String formatting when printing the CrimeADT Object
	 * @return String - Contains the formatting when printing the Object
	 */
	@Override
	public String toString() {
		return "id:" + id + " offence:" + offence + " residence:" + residence + " longitutde:" + longitude + " latitude:" +latitude + " nodeId:" + nodeId;
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
