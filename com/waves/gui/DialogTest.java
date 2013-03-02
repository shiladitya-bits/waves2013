package com.waves.gui;

import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class DialogTest extends JFrame implements ItemListener,ListSelectionListener
{
	String[] options = {"Yes","No","umm"};
	JRadioButton plain,bold,italic,boldItalic;
	ButtonGroup radioGroup;
	Font pfont,bfont,ifont,bifont;
	TextField tf;
	JList jlist;
	public DialogTest()
	{
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		int n = JOptionPane.showOptionDialog(this, "Dude this is message", "title qs", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		System.out.println(n);
		JPanel p = new JPanel();
		BoxLayout bl = new BoxLayout(p,BoxLayout.PAGE_AXIS);
		p.setLayout(bl);
		tf = new TextField("");
		p.add(tf);
		JPanel btnPanel = new JPanel();
		plain = new JRadioButton("Plain",true);
		bold = new JRadioButton("Bold",false);
		italic = new JRadioButton("Italic",false);
		boldItalic = new JRadioButton("Bold italic",false);
		plain.addItemListener(this);
		bold.addItemListener(this);
		italic.addItemListener(this);
		boldItalic.addItemListener(this);
		pfont = new Font("TimesRoman",Font.PLAIN,14);
		bfont = new Font("TimesRoman",Font.BOLD,14);
		ifont = new Font("TimesRoman",Font.ITALIC,14);
		bifont = new Font("TimesRoman",Font.BOLD+Font.ITALIC,14);
		
		btnPanel.add(plain);
		btnPanel.add(bold);
		btnPanel.add(italic);
		btnPanel.add(boldItalic);
		radioGroup = new ButtonGroup();
		radioGroup.add(plain);
		radioGroup.add(bold);
		radioGroup.add(italic);
		radioGroup.add(boldItalic);
		p.add(btnPanel);
		
		ArrayList<String> list = new ArrayList<String>();
		for(int i=0;i<100;i++)
		list.add("item"+i);
		
		jlist = new JList(list.toArray());
		jlist.setVisibleRowCount(5);
		jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		jlist.addListSelectionListener(this);
		JScrollPane spane = new JScrollPane(jlist);
		
		p.add(spane);
		setSize(300,300);
		this.setContentPane(p);
		setVisible(true);
		
	}
	public static void main(String args[])
	{
		DialogTest d = new DialogTest();
	}
	@Override
	public void itemStateChanged(ItemEvent e) 
	{
		if(e.getSource() == plain)
		{
			tf.setFont(pfont);
		}
		else if(e.getSource() == bold)
		{
			tf.setFont(bfont);
		}
		else if(e.getSource() == italic)
		{
			tf.setFont(ifont);
		}
		else if(e.getSource() == boldItalic)
		{
			tf.setFont(bifont);
		}
	}
	@Override
	public void valueChanged(ListSelectionEvent arg0) 
	{
		System.out.println(jlist.getSelectedValue());
	}
}
