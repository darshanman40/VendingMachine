package com.vendingmachine.services;

import com.vendingmachine.Interfaces.IService;

public class BalanceCheckImpl implements IService {

	Integer productPrice, totalBalance, remaining;
	@Override
	public void marshaller(Object object) {
		// TODO Auto-generated method stub
		totalBalance = (int)(object);
	}

	@Override
	public void process(Object object) {
		// TODO Auto-generated method stub
		productPrice = (int) object;
	}

	@Override
	public Object unmarshaller() {
		// TODO Auto-generated method stub
		if(productPrice==null)
			return null;
		else
			return ( totalBalance - productPrice );
	}

}
