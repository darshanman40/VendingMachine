package com.vendingmachine.services;

import java.util.*;

import com.vendingmachine.BusinessObjects.*;
import com.vendingmachine.Interfaces.*;

public class CoinChangeImpl implements IService {

	int remaining;
	public static IMoney penny = new Penny();
	public static IMoney nickle = new Nickle();
	public static IMoney dime = new Dime();
	public static IMoney quarter = new Quarter();
	Map<IMoney,Integer> coinTray;
	
	private void initCoinTray(){
		coinTray = new HashMap<IMoney,Integer>();
		coinTray.put(penny,0);
		coinTray.put(nickle,0);
		coinTray.put(dime,0);
		coinTray.put(quarter,0);
	}
	
	@Override
	public void marshaller(Object object) {
		// TODO Auto-generated method stub
		remaining = (Integer) object;
		initCoinTray();
		
	}

	@Override
	public void process(Object object) {
		if(object == null){
			process(quarter);
			process(dime);
			process(nickle);
			process(penny);
			return;
		}
		
		IMoney coin = (IMoney)object;
		while (remaining >= coin.getValue()){
			remaining = remaining - coin.getValue();
			coinTray.put(coin, (coinTray.get(coin)+1));
		}
	}

	@Override
	public Object unmarshaller() {
		return null;
	}

	public Map<IMoney,Integer> getCoinTray(){
		return coinTray;
	}
}
