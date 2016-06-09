package com.vendingmachine.BusinessObjects;

import com.vendingmachine.Interfaces.IMoney;

public class Nickle implements IMoney{

	private static final int value = 5;
	private static final String name = "Nickle";
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
