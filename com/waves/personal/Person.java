package com.waves.personal;

public abstract class Person {
	protected String name;
	protected Address address;
	protected char gender;
	protected long mobileNo;
	protected long emergencyNo;
	
	// getter methods
	public String getParticipantName()
	{
		return name;
	}
	public long getMobileNo()
	{
		return mobileNo;
	}
	public long getEmergencyNo()
	{
		return emergencyNo;
	}
	public Address getAddress()
	{
		return address;
	}
	public char getGender()
	{
		return gender;
	}
	//setter methods
	public void setParticipantName(String stu)
	{
		name = stu;
	}
	
	public void setMobileNo(long mobile)
	{
		mobileNo = mobile;
	}
	public void setEmergencyNo(long emergency)
	{
		emergencyNo = emergency;
	}
	public void setAddress(Address adr)
	{
		address = adr;
	}
	public void setGender(char g)
	{
		gender = g;
	}
	
}
