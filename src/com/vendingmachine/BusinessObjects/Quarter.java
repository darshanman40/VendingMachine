package com.vendingmachine.BusinessObjects;

import com.vendingmachine.Interfaces.IMoney;

public class Quarter implements IMoney {

	public final int value = 25;
	public final String name = "Quarter";
	
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
