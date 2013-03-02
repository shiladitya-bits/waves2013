package com.waves.festival;
public class Event
{
	private int event_no;
	private String name;
	private int position;
	Participant[] p; 
	private int pCount;
	//constructors
	public Event() 
	{
		pCount = 0;
		p = new Participant[100];
		
	}
	public Event(int event_number)
	{
		this();
		event_no = event_number;
	}
	public Event(int event_number, String nam)
	{
		this(event_number);
		name = nam;                
	}

	//getter methods
	public int getEventNum()
	{
		return event_no;
	}
	public String getEventName()
	{
		return name;
	}
	
	public void setEventNum(int evNo)
	{
		event_no = evNo;
	}
	public void setEventName(String n)
	{
		name = n; 
	}
	
    public void display()
    {
                System.out.println("event name="+name+" event id="+event_no);
                System.out.println("position in event="+position);
    }
    void addNewParticipant(Participant par)
    {
    	p[pCount] = par;
    	pCount++;
    }
    
    @Override
	public String toString() {
    	return this.name;
	}
	void displayParticipants()
    {
		System.out.println("Registered Participants for "+this.name+"-->");
    	for(int i=0;i<pCount;i++)
    	{
			System.out.println(p[i]);
    	}
    }
}