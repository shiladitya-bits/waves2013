package com.waves.gui;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
/*
 <applet code = "Sample" width=300 height=50>
 </applet>
 */
public class SampleApplet extends Applet 
{
	String msg;
	public void init()
	{
		//set foreground and background colors
		setBackground(Color.CYAN);
		setForeground(Color.RED);
		msg = "Inside init() -- ";
		this.setSize(500,500);
	}
	public void start()
	{
		msg = "inside start() -- ";
	}
	public void paint(Graphics g)
	{
		msg += "inside paint() -- ";
		g.drawString(msg,10,30);
	}
}
