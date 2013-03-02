package com.waves.personal;
public class Address
{
	private String flatNo;
	private String doorNo;
	private String street;
	private String landmark;
	private String city;
	private String district;
	private String state;
	private String country;
	private String pincode;
	
	//start of constructors
	
	public Address() {
		super();
		flatNo = doorNo = street = landmark = city = district = state = country = pincode = "";
	}
	
	public Address(String flatNo, String doorNo, String street,
			String landmark, String city, String district, String state,
			String country, String pincode) {
		
		this.flatNo = flatNo;
		this.doorNo = doorNo;
		this.street = street;
		this.landmark = landmark;
		this.city = city;
		this.district = district;
		this.state = state;
		this.country = country;
		this.pincode = pincode;
	}

	public Address(String flatNo, String doorNo, String pincode) {
		this();
		this.flatNo = flatNo;
		this.doorNo = doorNo;
		this.pincode = pincode;
	}

	public Address(String flatNo, String street, String city, String pincode) {
		this();
		this.flatNo = flatNo;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	}

	public Address(String state, String pincode) {
		this();
		this.state = state;
		this.pincode = pincode;
	}

	//end of constructors. start of getter setter methods.
	public String getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	//end of getter setter methods
	
	public void display()
	{
		System.out.println("Door No = "+doorNo);
		System.out.println("Flat No = "+flatNo);
		System.out.println("Street = "+street);
		System.out.println("Landmark = "+landmark);
		System.out.println("City = "+city);
		System.out.println("District = "+district);
		System.out.println("State = "+state);
		System.out.println("Country= "+country);
		System.out.println("Pin code = "+pincode);
		
	}

	@Override
	public String toString() 
	{
		String ret = doorNo+"\n"+flatNo+street+landmark+city+district+state+country+pincode+"\n";
		return ret;
		
	}
	
}