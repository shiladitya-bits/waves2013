package com.waves.sponsorship;

import com.waves.festival.Event;
import com.waves.personal.Address;

public class PrizeSponsor extends EventSponsors  
{
	public PrizeSponsor()
	{
		setName("");
		setEvent(new Event());
		setAddress(new Address());
		setMoney(0);
		setYears(0);
		
	}
	public PrizeSponsor(String name,int money,int years,Event ev)
	{
		this();
		setName(name);
		setMoney(money);
		setYears(years);
		setEvent(ev);
	}
	public PrizeSponsor(String name,int money,int years,Event ev,Address adr)
	{
		this(name,money,years,ev);
		setAddress(adr);
	}


}
