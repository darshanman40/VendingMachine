package com.vendingmachine.services;

import com.vendingmachine.Interfaces.IMoney;
import com.vendingmachine.Interfaces.IService;

public class InsertCoinImpl implements IService {

	private static Integer totalBalance;
	private Integer coinValue;
	
	
	@Override
	public void marshaller(Object object) {
		IMoney coin = (IMoney) object;
		coinValue=Integer.valueOf(coin.getValue());
	}

	@Override
	public void process(Object object) {
		totalBalance = (int) object;
		totalBalance+=coinValue;
	}

	@Override
	public Object unmarshaller() {
		return totalBalance;
	}

}
