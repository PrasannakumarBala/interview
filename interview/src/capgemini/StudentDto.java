package capgemini;

public class StudentDto {

	private int id;
	private String name;
	private Address ad;
	public StudentDto(){
		
	}
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the ad
	 */
	public Address getAd() {
		return ad;
	}
	/**
	 * @param ad the ad to set
	 */
	public void setAd(Address ad) {
		this.ad = ad;
	}
	
}
