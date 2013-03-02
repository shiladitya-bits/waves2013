package com.waves.personal;

public abstract class Student extends Person implements Comparable{
	protected String idNo;
	protected College clg;	
	protected float age;
	
	public void setIdNo(String id)
	{
		idNo = id;
	}
	public void setCollege(College c)
	{
		clg = c;
	}
	public String getIdNo()
	{
		return idNo;
	}
	public College getCollege()
	{
		return clg;
	}
	public float getAge()
	{
		return age;
	}
	public void setAge(float a)
	{
		age = a;
	}
	public int compareTo(Object arg) 
	{
		Student arg0 = (Student)arg;
		if( this.age == arg0.getAge())
			return 0;
		else if( this.age < arg0.getAge())
				return -1;
		else
				return 1;
	}

	
}
