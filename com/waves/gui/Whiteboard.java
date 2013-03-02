package com.waves.gui;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Whiteboard extends SimpleWhiteboard
{
	protected FontMetrics fm;
	Image back;
	String locations[] = {"a wing","b dome","c wing","adventure zone","library lawns","lt lawns(A)","lt lawns(B)"};
	
	public void init()
	{
		super.init();
		back = getImage(getClass().getResource("bits.jpg"));
		Font font = new Font("Serif",Font.BOLD,20);
		setFont(font);
		fm = getFontMetrics(font);
		addKeyListener(new CharDrawer());
		this.setSize(850,650);
	}
	public void paint(Graphics g)
	{	
		g.drawImage(back,0,0,getWidth(),getHeight(),this);
		super.paint(g);
	}
	private class CharDrawer extends KeyAdapter
	{
		//when user types a printable character, draw it and shift position rightwards
		public void keyTyped(KeyEvent event)
		{
			String s = String.valueOf(event.getKeyChar());
			getGraphics().drawString(s, lastX, lastY);
			record(lastX+fm.stringWidth(s),lastY);
		}
	}
}
