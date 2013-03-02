package com.waves.gui;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.image.ImageObserver;

import javax.naming.Context;

public class SimpleWhiteboard extends Applet
{
	protected int lastX=0,lastY=0;
	//Image back;
	int rec_x,rec_y,rec_width,rec_height;
	public void init()
	{
		setBackground(Color.WHITE);
		setForeground(Color.BLUE);
		this.addMouseListener(new PositionRecorder());
		this.addMouseMotionListener(new LineDrawer());
		
	}
	protected void record(int x,int y)
	{
		lastX = x;
		lastY = y;
		rec_height = y - rec_y;
		rec_width = x - rec_x;

	}
	
	private class PositionRecorder extends MouseAdapter
	{
		
		@Override
		public void mouseClicked(MouseEvent event) 
		{
			requestFocus();
			rec_x = event.getX();
			rec_y = event.getY();
			record(event.getX(),event.getY());
			getAppletContext().showStatus("click: x="+event.getX()+", y="+event.getY());			
			super.mouseClicked(event);
		}
		@Override
		public void mousePressed(MouseEvent event) 
		{
			rec_x = event.getX();
			rec_y = event.getY();
			super.mousePressed(event);
		}
		@Override
		public void mouseReleased(MouseEvent event) 
		{
			//getGraphics().drawRect(rec_x, rec_y, rec_width, rec_height);
			record(event.getX(),event.getY());
			repaint(rec_x,rec_y,rec_width+1,rec_height+1);
			super.mouseReleased(event);
		}		
	}
	private class LineDrawer extends MouseMotionAdapter
	{
		
		
		public void mouseDragged(MouseEvent event)
		{
			int x = event.getX();
			int y = event.getY();
			Graphics g = getGraphics();
			//g.drawLine(lastX, lastY, x, y);
			record(x,y);
		//	g.drawRect(rec_x, rec_y, rec_width, rec_height);
		}
		public void mouseMoved(MouseEvent event)
		{
			getAppletContext().showStatus("x="+event.getX()+", y="+event.getY());			
		}
	}
}

