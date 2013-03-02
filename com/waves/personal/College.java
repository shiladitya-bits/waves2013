package com.waves.personal;
public class College
{
	private String clgName;
	private String university;
	public College(String clg,String univ)
	{
		clgName = clg;
		university = univ;
	}
	public String getCollegeName()
	{	
		return clgName;
	}
	public String getUnivName()
	{
		return university;
	}
	public void setCollege(String clg)
	{
		clgName = clg;
	}
	public void setUniversity(String univ)
	{
		university = univ;
	}
	public void display()
	{
		System.out.println("college name = "+clgName);
		System.out.println("university = "+university);
	}

}