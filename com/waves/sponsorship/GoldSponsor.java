package com.waves.sponsorship;

import com.waves.personal.Address;

public class GoldSponsor extends FestivalSponsors
{
	public GoldSponsor()
	{
		setName("");
		setAddress(new Address());
		setMoney(0);
		setYears(0);
	}
	public GoldSponsor(String name,int money,int years)
	{
		this();
		setName(name);
		setMoney(money);
		setYears(years);
	}
	public GoldSponsor(String name,int money,int years,Address adr)
	{
		this(name,money,years);
		setAddress(adr);
	}
	
	
}
