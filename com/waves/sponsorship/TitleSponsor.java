package com.waves.sponsorship;

import com.waves.festival.Event;
import com.waves.personal.Address;

public class TitleSponsor extends EventSponsors implements Comparable
{

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	public TitleSponsor()
	{
		setName("");
		setEvent(new Event());
		setAddress(new Address());
		setMoney(0);
		setYears(0);
		
	}
	public TitleSponsor(String name,int money,int years,Event ev)
	{
		this();
		setName(name);
		setMoney(money);
		setYears(years);
		setEvent(ev);
	}
	public TitleSponsor(String name,int money,int years,Event ev,Address adr)
	{
		this(name,money,years,ev);
		setAddress(adr);
	}

}
