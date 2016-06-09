package com.vendingmachine.services;

import com.vendingmachine.BusinessObjects.*;
import com.vendingmachine.Interfaces.*;


public class TextToProductImpl implements IService {

	String name;
	IProduct product;
	
	@Override
	public void marshaller(Object object) {
		// TODO Auto-generated method stub
		name = String.valueOf(object);
		process(null);
	}

	@Override
	public void process(Object object) {
		// TODO Auto-generated method stub
		if(name.equals("1") || name.equalsIgnoreCase("candy")){
			product = new Candy();
		}
		
		else if(name.equals("2") || name.equalsIgnoreCase("chips")){
			product = new Chips();
		}
		
		else if(name.equals("3") || name.equalsIgnoreCase("cola")){
			product = new Cola();
		}else{
			System.out.println("invalid product"); 	
		}
	}

	@Override
	public Object unmarshaller() {
		// TODO Auto-generated method stub
		return product;
	}

}
