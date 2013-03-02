package com.waves.festival;

import com.waves.personal.Address;
import com.waves.personal.College;

public class UseParticipant
{
	static Participant[] p = new Participant[4];
	public static void main(String args[])
	{
		
		
		College c = new College("BITS Goa","BITS Pilani");
		Address a = new Address("5A","48/E","700027");
		Event e = new Event(100,"dance");
		Event e2 = new Event(102,"singing");
		p[0] = new Participant(c);
		p[1] = new Participant("siddhartha","2010111",c);
		p[2] = new Participant("shiladitya","2010632",c,9561989755L,8007231464L,a,'m',20);
		p[3] = new Participant("ashmita","2011423",c,8103144151L,7891141041L,a,'f',19,e);
		p[0].registerForEvent(e);
		p[1].registerForEvent(e2);
		p[2].registerForEvent(e2);
        p[0].display();
        p[1].display();
        p[2].display();
        p[3].display();
	}
}
