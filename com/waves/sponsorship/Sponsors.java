package com.waves.sponsorship;

import com.waves.personal.Address;

public abstract class Sponsors implements NoOfYears,Comparable
{
	private String name;
	private Address address;
	private long money;
	private int years;
	public int getNoOfYears()
	{
		return years; 
	}
	public int compareTo(Object arg0) 
	{
		
		Sponsors sp = (Sponsors)arg0;
		if( this.money < sp.money)
			return -1;
		else if( this.money > sp.money)
			return 1;
		else
		{
			if(getNoOfYears() < sp.getNoOfYears())
				return -1;
			else if(getNoOfYears() > sp.getNoOfYears())
				return 1;
			else 
				return 0;
				
			//return 0;
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	
	
}
