package com.vendingmachine.BusinessObjects;

import com.vendingmachine.Interfaces.IMoney;

public class Penny implements IMoney{

	
	private final int value=1;
	private final String name="Penny";
	
	@Override
	public int getValue() {
		return value;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	

}
