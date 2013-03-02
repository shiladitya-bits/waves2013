package com.waves.personal;
import java.util.StringTokenizer;

public class TestAddress {
	static Address[] adr = new Address[5];
	public static void main(String args[])
	{
		
		adr[0] = new Address("3C","23/F/1A","7027aaaa");
		adr[1] = new Address("45A","park street","kolkata","700026");
		adr[2] = new Address("2B/H","3A","gariahat road","pantaloons","kolkata","kolkata","west bengal","india","700025");
		
		adr[3] = new Address("Goa","403726");
		
		String address = "#3A,1-164,Ist Line,Farmagudi,Ponda,Goa,403 405";
		StringTokenizer add = new StringTokenizer(address,",");
		
		adr[4] = new Address();
		adr[4].setFlatNo(add.nextToken());
		adr[4].setDoorNo(add.nextToken());
		adr[4].setStreet(add.nextToken());
		adr[4].setCity(add.nextToken());
		adr[4].setDistrict(add.nextToken());
		adr[4].setState(add.nextToken());
		adr[4].setPincode(add.nextToken());
		
		for(int i=0;i<5;i++)
		{
			displayGoans(adr[i]);
		}
		for(int j=0;j<5;j++)
		{
				System.out.println(validatePincode(adr[j]));
		}
	}
	public static void displayGoans(Address a)
	{
		//displaying the address only if state is goa
		if(a.getState().equalsIgnoreCase("goa"))
		{
			System.out.println(a);
		}
	}
	/**
	 * 
	 * @param a
	 * @return
	 */
	public static boolean validatePincode(Address a)
	{
		String pin = a.getPincode();
		if(pin.length() < 6)
			return false;
		for(int i=0; i<pin.length(); i++)
		{
			char ch = pin.charAt(i);
			
			if(!((ch>='0' && ch<='9') || ch==' '))
				return false;

		}
		return true;
	}

}
