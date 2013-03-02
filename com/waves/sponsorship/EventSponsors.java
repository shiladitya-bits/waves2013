package com.waves.sponsorship;

import com.waves.festival.Event;

public abstract class EventSponsors extends Sponsors
{
	private Event event;
	
		
	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}
	@Override
	public String toString()
	{
		String out = this.getName()+" "+this.getMoney()+" "+this.getNoOfYears()+" "+this.getEvent()+"\n";
		return out;
	}
}
