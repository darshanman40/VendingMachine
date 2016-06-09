package com.vendingmachine.main;

import java.util.*;

import com.vendingmachine.BusinessObjects.*;
import com.vendingmachine.Do.CoinManagementDO;
import com.vendingmachine.Interfaces.*;

public class MainProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		CoinManagementDO cmdo = new CoinManagementDO();
		Integer remaining;
		Map<IMoney,Integer> changeTray;// , inputCoinTray;
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		while(true){
			IMoney coin;
			
			System.out.println("Insert coin");
			System.out.println("Penny");
			System.out.println("Nickle");
			System.out.println("Dime");
			System.out.println("Quarter");
			String coinText = reader.nextLine().toString();
			coin = cmdo.textToCoin(coinText);
			
			cmdo.insertCoin(coin);
			
			//cmdo.setTotalBalance(coinTrayCalc(new HashMap<IMoney,Integer>()));
			
			remaining = cmdo.balanceCheck();
			if (remaining==null){
				//TODO mention options
				System.out.println("Enter Product");
				System.out.println("1. Candy ");
				System.out.println("2. Chips ");
				System.out.println("3. Cola ");
				String product = reader.nextLine().toString();
				cmdo.selectProduct(product);
				continue;
			}else{
				if(remaining< 0){
					continue;
				}else{
					System.out.println("remaining = "+ remaining);
					changeTray=cmdo.coinChangeReturn();
					//System.out.println("pennies = "+changeTray.get(new Penny()));
					for(IMoney coinKey : changeTray.keySet()){
						if(changeTray.get(coinKey)!=0)
							System.out.println(coinKey.getName()+" = "+changeTray.get(coinKey) +" coin(s)"); 
					}
					break;
				}
			}
		}
		*/
	}
	
	public static Integer coinTrayCalc(Map<IMoney,Integer> inputCoinTray){
		int total = 0;
		inputCoinTray.put(new Penny(), 10);
		inputCoinTray.put(new Dime(), 10);
		inputCoinTray.put(new Quarter(), 10);
		for(IMoney coinKey : inputCoinTray.keySet()){
			total = total + (coinKey.getValue() * (inputCoinTray.get(coinKey)));
		}
		return total;
	}

}
