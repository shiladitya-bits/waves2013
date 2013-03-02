package com.waves.sponsorship;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

import com.waves.festival.Event;
/**
 * 
 * @author bamboo
 *
 */
public class MainActivity 
{
	/**
	 * 
	 * @param args
	 */
	public static void main(String args[]) 
	{
		Sponsors[] sp = new Sponsors[3];
		sp[0] = new GoldSponsor("gold sponsor",10000,3);
		sp[1] = new PrizeSponsor("prize sponsor",5000,2,new Event(100,"dance"));
		sp[2] = new PlatinumSponsor("platinum sponsor",30000,2);
		System.out.println("List of sponsors before sorting");
		display(sp);
		System.out.println("--------------------------------------------------");
		sort(sp);
		display(sp);
		try{
			//PART 1
			FileWriter fw = new FileWriter("output.txt");	
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i=0;i<sp.length;i++)
			{
				bw.write(sp[i].toString()); //writing each sponsor details to file
			}
			bw.close();
			fw.close();
			// PART 2 starts 
			File f = new File("part2.txt");
			FileWriter fw2 = new FileWriter(f);
			BufferedWriter bw2 = new BufferedWriter(fw2);
			for(int i=0;i<sp.length;i++)
			{
				bw2.write(Long.toString(sp[i].getMoney()));
				bw2.write("\n");
			}
			bw2.close();
			fw2.close();
			Scanner sc = new Scanner(f);
			long sum = 0;
			//scanning from file and adding to sum
			while(sc.hasNextLong())
			{
				sum += sc.nextLong();
			}
			sc.close();
			System.out.println("total money collected = Rs."+sum);
		}
		catch(Exception e)
		{
			System.err.println("Error: " + e.getMessage());
		}
			
}
	public static void display(Sponsors[] sp)
	{
		for( int i=0; i<sp.length; i++)
		{
			System.out.println(sp[i].getName());
		}
	}
	public static void sort(Sponsors[] sp)
	{
		System.out.println("Sorting in descending order");
		Sponsors max;
		int pos,i=0,j=0;
		for(i=0;i<sp.length-1;i++)
		{
			pos = i;
			max = (Sponsors)sp[i];
			
			for(j=i+1;j<sp.length;j++)
			{
				if(sp[j].compareTo(max) > 0)
				{
					//System.out.println(sp[j].getName() + " less than "+min.getName());
					max = (Sponsors)sp[j];
					pos = j;
				}
			}
			if(pos!=i)
			{
				//System.out.println(sp[i].getName()+" swapped with "+min.getName());
				Sponsors tmp = (Sponsors)sp[i];
				sp[i] = max;
				sp[pos] = tmp;
			}
		}
	
	}
	
}
