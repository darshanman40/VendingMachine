package com.vendingmachine.BusinessObjects;

import com.vendingmachine.Interfaces.IMoney;

public class Dime implements IMoney{

	private static final int  value = 10;
	private static final String  name = "Dime";
	
	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
