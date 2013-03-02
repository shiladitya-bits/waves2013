package com.waves.sponsorship;

import com.waves.festival.Event;
import com.waves.personal.Address;

public class SilverSponsor extends FestivalSponsors 
{
	public SilverSponsor()
	{
		setName("");
		setAddress(new Address());
		setMoney(0);
		setYears(0);
	}
	public SilverSponsor(String name,int money,int years)
	{
		this();
		setName(name);
		setMoney(money);
		setYears(years);
	}
	public SilverSponsor(String name,int money,int years,Address adr)
	{
		this(name,money,years);
		setAddress(adr);
	}

}
