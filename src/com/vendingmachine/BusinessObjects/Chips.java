package com.vendingmachine.BusinessObjects;

import com.vendingmachine.Interfaces.IProduct;

public class Chips implements IProduct {
	
	public final String name = "Chips";
	public final int value = 170;
	
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
