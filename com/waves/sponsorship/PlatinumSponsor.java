package com.waves.sponsorship;

import com.waves.personal.Address;

public class PlatinumSponsor extends FestivalSponsors
{

	public PlatinumSponsor()
	{
		setName("");
		setAddress(new Address());
		setMoney(0);
		setYears(0);
	}
	public PlatinumSponsor(String name,int money,int years)
	{
		this();
		setName(name);
		setMoney(money);
		setYears(years);
	}
	public PlatinumSponsor(String name,int money,int years,Address adr)
	{
		this(name,money,years);
		setAddress(adr);
	}
	
}
