package com.vendingmachine.BusinessObjects;

import com.vendingmachine.Interfaces.IProduct;

public class Cola implements IProduct {

	public final String name = "Cola";
	public final int value = 225;
	
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
