package com.vendingmachine.Do;

import java.util.*;

import com.vendingmachine.Interfaces.*;
import com.vendingmachine.services.*;

public class CoinManagementDO {

	InsertCoinImpl ic;
	TextToCoinImpl tcImpl;
	TextToProductImpl tpImpl;
	BalanceCheckImpl bcImpl;
	CoinChangeImpl ccImpl;
	IProduct product; 
	static Integer totalBalance,productPrice, remaining;
	
	{
		ic = new InsertCoinImpl();
		tcImpl = new TextToCoinImpl();
		bcImpl = new BalanceCheckImpl();
		tpImpl = new TextToProductImpl();
		ccImpl = new CoinChangeImpl();
		totalBalance = 0;
		productPrice = 0;
		remaining = null;
	}
	
	public IMoney textToCoin(String value){
		tcImpl.marshaller(value);
		return (IMoney)tcImpl.unmarshaller();
	}
	
	public void insertCoin(IMoney coin){
		ic.marshaller(coin);
		ic.process(totalBalance);
		this.totalBalance = (int)ic.unmarshaller();
		System.out.println("totalBalance = "+totalBalance);	
	}
	
	public void selectProduct(String name){
		tpImpl.marshaller(name);
		product = (IProduct)tpImpl.unmarshaller();
		productPrice = product.getValue();
	}
	
	public Integer balanceCheck(){
		if(productPrice == 0)
			return null;
		bcImpl.marshaller(totalBalance);
		bcImpl.process(productPrice);
		remaining = (Integer)bcImpl.unmarshaller();
		return remaining;
	}
	
	public Map<IMoney,Integer> coinChangeReturn(){
		ccImpl.marshaller(remaining);
		ccImpl.process(null);
		return ccImpl.getCoinTray();
		//return null;
	}
	
	public static void setTotalBalance(Integer balance){
		totalBalance = balance;
	}
	
	
}
