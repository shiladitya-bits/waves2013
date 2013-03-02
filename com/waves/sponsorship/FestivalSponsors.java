package com.waves.sponsorship;

public abstract class FestivalSponsors extends Sponsors
{
	@Override
	public String toString()
	{
		String out = this.getName()+" "+this.getMoney()+" "+this.getNoOfYears()+"\n";
		return out;
	}
}
