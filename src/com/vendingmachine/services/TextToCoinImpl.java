package com.vendingmachine.services;

import com.vendingmachine.BusinessObjects.*;
import com.vendingmachine.Interfaces.IMoney;
import com.vendingmachine.Interfaces.IService;

public class TextToCoinImpl implements IService {

	String input="";
	IMoney coin;
	public static IMoney penny = new Penny();
	public static IMoney nickle = new Nickle();
	public static IMoney dime = new Dime();
	public static IMoney quarter = new Quarter();
	@Override
	public void marshaller(Object object) {
		input = String.valueOf(object);
		process(null);
	}

	@Override
	public void process(Object object) {
		// TODO Auto-generated method stub
		if(input.equals("1") || input.equalsIgnoreCase("penny")){
			coin = penny;
		}else if(input.equals("5") || input.equalsIgnoreCase("nickle")){
			coin = nickle;
		}
		
		else if(input.equals("10") || input.equalsIgnoreCase("dime")){
			coin = dime;
		}
		
		else if(input.equals("25") || input.equalsIgnoreCase("quarter")){
			coin = quarter;
		}else{
			System.out.println("invalid coin"); 	
		}
	}

	@Override
	public Object unmarshaller() {
		// TODO Auto-generated method stub
		return coin;
	}

}
