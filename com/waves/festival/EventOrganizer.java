package com.waves.festival;
public class EventOrganizer
{
	public static void main(String args[]) 
	{
		Participant par[] = new Participant[10];
		Event ev[] = new Event[10];
		
		for(int i=0;i<10;i++)
		{
			par[i]  = new Participant();
			par[i].setParticipantName("participant "+(i+1));
			
			ev[i] = new Event(i+1);
			ev[i].setEventName("event "+(i+1));
		}
		par[0].registerForEvent(ev[0]);
		par[0].registerForEvent(ev[4]);
		par[0].registerForEvent(ev[7]);
		par[0].displayEvents();
		
		ev[0].addNewParticipant(par[3]);
		ev[0].addNewParticipant(par[4]);
		ev[0].displayParticipants();
		
	}
}