package com.waves.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class LabFinal extends JFrame implements ActionListener,ItemListener,ListSelectionListener
{
	public LabFinal()
	{
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel name = new JPanel();
		
		name.setLayout(new GridLayout(2,4)); //for name last name ...
		
		String[] form_ob = new String[]{"Item1","Item2","Item3","Item4"};
		JLabel fname = new JLabel("First Name");
		JLabel lname = new JLabel("Last Name");
		JLabel title = new JLabel("Title");
		JLabel nick = new JLabel("NickName");
		JLabel format = new JLabel("Format");
		JTextField fnamefield = new JTextField();
		JTextField lnamefield = new JTextField();
		JTextField titlefield = new JTextField();
		JTextField nickfield = new JTextField();
		JComboBox formatbox = new JComboBox(form_ob);
		name.add(fname);
		name.add(fnamefield);
		name.add(lname);
		name.add(lnamefield);
		name.add(title);
		name.add(titlefield);
		name.add(nick);
		name.add(nickfield);
		
		JPanel top1 = new JPanel();
		
		BoxLayout blayout = new BoxLayout(top1,BoxLayout.PAGE_AXIS);
	
		top1.setLayout(blayout);
		
		JPanel formpanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		formpanel.add(format);
		formpanel.add(formatbox);
		
		JButton add = new JButton("Add");
		JButton edit = new JButton("Edit");
		JButton remove = new JButton("Remove");
		JButton def = new JButton("Default");

		
		top1.add(name);
		top1.add(formpanel);
		top1.setBorder(BorderFactory.createTitledBorder("Name"));
		
		//middle panel
		JPanel mid = new JPanel(new BorderLayout());
		mid.setBorder(BorderFactory.createTitledBorder("Email"));
	
		JPanel btns = new JPanel();
		BoxLayout midbtnslayout = new BoxLayout(btns,BoxLayout.PAGE_AXIS);
		btns.setLayout(midbtnslayout);
		btns.add(add);
		btns.add(edit);
		btns.add(remove);
		btns.add(def);
		JPanel emailaddress = new JPanel();
		JPanel emailitems = new JPanel();
		JPanel mailformat = new JPanel(new FlowLayout(FlowLayout.LEFT));
		mailformat.setBorder(BorderFactory.createTitledBorder(BorderFactory.createLineBorder(Color.BLACK, 0), "Mail format:"));
		JRadioButton html,ptext,custom;
		html = new JRadioButton("HTML",false);
		ptext = new JRadioButton("Plain Text",false);
		custom = new JRadioButton("Custom",true);
		html.addItemListener(this);
		ptext.addItemListener(this);
		custom.addItemListener(this);
		ButtonGroup grp = new ButtonGroup();
		grp.add(html);
		grp.add(ptext);
		grp.add(custom);
		mailformat.add(html);
		mailformat.add(ptext);
		mailformat.add(custom);
		
		JPanel midmain = new JPanel();
		BoxLayout midmainlayout = new BoxLayout(midmain,BoxLayout.PAGE_AXIS);
		midmain.setLayout(midmainlayout);
		JLabel eaddress =new JLabel("Email Address:");
		JTextField efield = new JTextField("                 ");
		JPanel epanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		epanel.add(eaddress);
		epanel.add(efield);
		midmain.add(epanel);
		String[] list2 = new String[]{"Item1","Item2","Item3","Item4","Item5"};
		JList elist = new JList(list2);
		elist.setVisibleRowCount(4);
		elist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JScrollPane scr = new JScrollPane(elist);
		midmain.add(scr);
		mid.add(midmain,BorderLayout.CENTER);
		mid.add(btns,BorderLayout.EAST);
		mid.add(mailformat,BorderLayout.SOUTH);
		elist.addListSelectionListener(this);
		
		//bottom panel
		JPanel bot = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton ok = new JButton("OK");
		JButton cancel = new JButton("Cancel");
		bot.add(ok);
		bot.add(cancel);
		//end of bottom
		
		//let us start joining
		JPanel finpanel = new JPanel(new BorderLayout());
		finpanel.add(top1,BorderLayout.NORTH);
		finpanel.add(bot,BorderLayout.SOUTH);
		finpanel.add(mid,BorderLayout.CENTER);
		this.setContentPane(finpanel);
		this.pack();
		this.setVisible(true);
		
	}
	public static void main(String args[])
	{
		LabFinal exe = new LabFinal();
				
	}
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub
		
	}
	@Override
	public void valueChanged(ListSelectionEvent arg0) 
	{
		System.out.println(arg0.getSource().toString());
	}
	@Override
	public void itemStateChanged(ItemEvent arg0) 
	{
		System.out.println(arg0.getSource().toString());
	}

}
