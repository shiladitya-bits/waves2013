package com.waves.festival;
import com.waves.personal.Address;
import com.waves.personal.College;
import com.waves.personal.Student;

public class Participant extends Student
{
	private Event[] ev ;
	private int evCount;
	//constructor 1 - only College	
	public Participant()
	{
		evCount=0;
		ev = new Event[10];
		address = new Address();
	}
	public Participant(College c)
	{
		this();
		clg = c;
	}
	
	//constructor 2 - only College, student name, and ID no.
	public Participant(String stu,String id,College c)
	{
		this(c);
		name = stu;
		idNo = id;
		
	}

	//constructor 3 - all values
	public Participant(String stu, String id, College c, long contact, long emergency, Address adr,char stu_gender, int stu_age)
	{
		this(stu,id,c);
;
		mobileNo = contact;
		emergencyNo = emergency;
		address = adr;
		gender =  stu_gender;
		age = (float)stu_age;
	}
	//constructor 4 - all values with event
	public Participant(String stu, String id, College c, long contact, long emergency, Address adr,char stu_gender, int stu_age,Event ev1)
	{
		this(stu,id,c,contact,emergency,adr,stu_gender,stu_age);

		ev[0] = ev1;
		evCount++;
	}

	public void display()
	{
		System.out.println("---------NEW PARTICIPANT-----------");
		System.out.println("name = "+name);
		System.out.println("id no = "+idNo);
		clg.display();
		System.out.println("mobile number = "+mobileNo);
		System.out.println("emergency number = "+emergencyNo);
		address.display();
		System.out.println("gender = "+gender);
		System.out.println("age = "+age);
		ev[0].display();
		System.out.println("---------END OF PARTICIPANT-----------");
		
	}
    @Override
	public String toString()
    {
    	return this.name;
	}
	void registerForEvent(Event e)
	{
		ev[evCount] = e;
		evCount++;
	}
	
	void displayEvents()
	{
		System.out.println("Registered Events -->");
		for(int i=0;i<evCount;i++)
		{
			System.out.println(ev[i]);		
		}
	}			
}