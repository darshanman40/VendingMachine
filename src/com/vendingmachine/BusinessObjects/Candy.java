package com.vendingmachine.BusinessObjects;

import com.vendingmachine.Interfaces.IProduct;

public class Candy implements IProduct {

	public final String name = "Candy";
	public final int value = 100;
	
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
