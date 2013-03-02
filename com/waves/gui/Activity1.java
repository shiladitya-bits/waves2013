package com.waves.gui;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

public class Activity1 extends JFrame implements ActionListener {

	static JTextField text;
	static JButton a,b,c,d;
	static JLabel label;
	int clicks;
	
	public Activity1()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		text = new JTextField();
		clicks = 0;
		a = new JButton("A");
		b = new JButton("B");
		c = new JButton("C");
		d = new JButton("D");
		
		a.addActionListener(this);
		b.addActionListener(this);
		c.addActionListener(this);
		d.addActionListener(this);
		
		label = new JLabel("Total number of clicks = " + clicks);

		
		JPanel fin1 = new JPanel();
		BoxLayout bb =new BoxLayout(fin1,BoxLayout.PAGE_AXIS);
		fin1.setLayout(bb);
		fin1.add(text);
		GridLayout gg = new GridLayout(2,2);
		JPanel btn1 = new JPanel(gg);
		btn1.add(a);
		btn1.add(b);
		btn1.add(c);
		btn1.add(d);
		fin1.add(btn1);
		fin1.add(label);
		this.setContentPane(fin1);
		this.pack();
		
		this.setVisible(true);
	}	
	
	public static void main(String args[])
	{
		Activity1 f = new Activity1();
				
	}
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		String res = text.getText().toString();
		res = res + arg0.getActionCommand().toString();
		text.setText(res);
		clicks++;
		label.setText("Total number of clicks = " + Integer.toString(clicks));
	}	
	
	
}
