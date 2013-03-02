package com.waves.gui;

import java.applet.Applet;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import com.waves.festival.Event;
import com.waves.festival.Participant;
import com.waves.personal.College;
import com.waves.sponsorship.GoldSponsor;
import com.waves.sponsorship.PlatinumSponsor;
import com.waves.sponsorship.PrizeSponsor;
import com.waves.sponsorship.Sponsors;
import com.waves.sponsorship.TitleSponsor;

public class DisplayAll extends Applet implements ActionListener
{
	Label tf;
	List<Participant> plist;
	List<Event> elist;
	List<Sponsors> slist;
	@Override
	public void init() 
	{
		super.init();
		plist = new LinkedList<Participant>();
		elist = new ArrayList<Event>();
		slist = new ArrayList<Sponsors>();
		putData();
		Menu menu = new Menu("Display");
		MenuItem item1 = new MenuItem("Participants");
		MenuItem item2 = new MenuItem("Events");
		MenuItem item3 = new MenuItem("Sponsors");
		menu.add(item1);
		menu.add(item2);
		menu.add(item3);
		MenuBar mbar = new MenuBar();
		mbar.add(menu);
		
		item1.setActionCommand("participants");
		item2.setActionCommand("events");
		item3.setActionCommand("sponsors");
		item1.addActionListener(this);
		item2.addActionListener(this);
		item3.addActionListener(this);
		Object f = getParent();
		
		while(!(f instanceof Frame))
		{
			f = ((Component)f).getParent();
		}
		
		((Frame)f).setMenuBar(mbar);
		tf = new Label("");
		tf.setSize(200, 500);
		this.add(tf);
		this.setSize(getMaximumSize());
		//this.validate();
	}

	@Override
	public void actionPerformed(ActionEvent event) 
	{
		String out1 = "";
		if(event.getActionCommand().equals("participants"))
		{
			showStatus("participants");
			Iterator<Participant> i = plist.iterator();
			while(i.hasNext())
			{
				out1 = out1+ i.next().toString()+" ";
			}
			System.out.println(out1);
			tf.setText(out1);
			//tf.resize(tf.preferredSize());
			this.validate();
		}
		else if(event.getActionCommand().equals("events"))
		{
	
			showStatus("events");
			Iterator<Event> i = elist.iterator();
			while(i.hasNext())
			{
				out1 = out1+i.next().toString()+" ";
			}
			System.out.println(out1);
			tf.setText(out1);
			//tf.resize(tf.preferredSize());
			this.validate();
		}
		else if(event.getActionCommand().equals("sponsors"))
		{
			
			showStatus("sponsors");
			Iterator<Sponsors> i = slist.iterator();
			while(i.hasNext())
			{
				out1 = out1+i.next().getName()+" ";
			}
			System.out.println(out1);
			tf.setText(out1);
			//tf.resize(tf.preferredSize());
			this.validate();
		}
	}
	void putData()
	{
		College c = new College("bits goa", "pilani");
		plist.add(new Participant("shila","2010632",c));
		plist.add(new Participant("ankit","2010222",c));
		plist.add(new Participant("kepin","2010111",c));	
		
		Event e1 = new Event(100,"dance");
		Event e2 = new Event(101,"fashp");
		elist.add(e1);
		elist.add(e2);
		
		Sponsors s1 = new GoldSponsor("google",50000,3);
		Sponsors s2 = new PlatinumSponsor("microsoft",40000,2);
		Sponsors s3 = new TitleSponsor("dettol",20000,1,e1);
		Sponsors s4 = new PrizeSponsor("bambceil",10000,5,e2);
		slist = new ArrayList<Sponsors>();
		slist.add(s1);
		slist.add(s2);
		slist.add(s3);
		slist.add(s4);
		
	}
	
}
