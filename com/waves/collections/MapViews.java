package com.waves.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import com.waves.festival.Participant;
import com.waves.personal.College;

public class MapViews implements Comparator
{
	public static void main(String args[])
	{
		College c = new College("bits goa", "bits pilani");
		Participant p1 = new Participant("shila","2010632",c);
		Participant p2 = new Participant("bankit","2010111",c);
		Participant p3 = new Participant("kapple","2010222",c);
		
		HashMap<String,Participant> hmap = new HashMap<String, Participant>();
		hmap.put(p1.getParticipantName(), p1);
		hmap.put(p2.getParticipantName(), p2);
		hmap.put(p3.getParticipantName(), p3);
		
		//USING ENTRY SET
		Set<Map.Entry<String,Participant>> mapSet = hmap.entrySet();     //set of entry items in hashmap
		Iterator<Map.Entry<String,Participant>> iter = mapSet.iterator(); // iterator over the above set
		while(iter.hasNext())
		{
			Participant tmp = iter.next().getValue();   //printing from the iterator. items in hashmap ultimately
		//	System.out.println(tmp);
		}
		
		//USING KEY SET
		Set<String> set2 = hmap.keySet();            //set of key values in hashmap
		Iterator<String> it = set2.iterator();      //iterator over above set
		MapViews mptest = new MapViews();
		ArrayList<String> alist = new ArrayList<String>(set2);  //list of the set
		Collections.sort(alist,mptest);        //sorting th above list based on Comparator interface defined here
		
		for(String stmp : alist)
		{
			Participant p = hmap.get(stmp);    //take the keys and get the corresponding values from hashmap
			//System.out.println(p);
		}
		/*
		 * Tree map
		 * */
		TreeMap<String,Participant> tm = new TreeMap<String, Participant>(mptest);  //easy way of storing in sorted way
 		tm.put(p1.getParticipantName(),p1);
		tm.put(p2.getParticipantName(),p2);
		tm.put(p3.getParticipantName(),p3);
		//System.out.println(tm);
		Set s2 = tm.entrySet();             //entrySet of items in treemap
		Iterator i2 = s2.iterator();        //iterator over above set
 		while(i2.hasNext())
		{
			//Participant t = tm.get(i2.next());
			Map.Entry me = (Map.Entry)i2.next();      //Map.Entry object
			Participant t = (Participant)me.getValue();    //get value
			System.out.println(t);
			
		}
	}

	@Override
	public int compare(Object o1, Object o2) 
	{
		if(o1 != null && o2 != null && o1 instanceof String && o2 instanceof String)
		{
			String s1 = (String)o1;
			String s2 = (String)o2;
			return -(s1.compareTo(s2));
		}
		else
			return 0;
	}
}
