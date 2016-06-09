package com.vendingmachine.test;

import java.util.*;

import org.junit.Test;

import com.vendingmachine.BusinessObjects.Dime;
import com.vendingmachine.BusinessObjects.Penny;
import com.vendingmachine.BusinessObjects.Quarter;
import com.vendingmachine.Do.CoinManagementDO;
import com.vendingmachine.Interfaces.IMoney;


import junit.framework.TestCase;

public class ColaTest extends TestCase {

	private int total; 
	private CoinManagementDO cmdo;
	private Integer remaining;
	private Map<IMoney,Integer>inputCoinTray;
	private Map<IMoney,Integer> changeTray;// , inputCoinTray;
	private IMoney coin;
	private String output ="";
	 protected void setUp(){
		 	cmdo = new CoinManagementDO();
			remaining = null;
		 	total = 0;
		 	inputCoinTray = new HashMap<IMoney,Integer>();
			inputCoinTray.put(new Penny(), 10);
			inputCoinTray.put(new Dime(), 9);
			inputCoinTray.put(new Quarter(), 5);
			//for(IMoney coinKey : inputCoinTray.keySet()){
			//	total = total + (coinKey.getValue() * (inputCoinTray.get(coinKey)));
			//}
			
	   }
	 
	 @Test
	 public void testColaZeroRemain() {
		 while(true){
				remaining = cmdo.balanceCheck();
				if (remaining==null){
					printProductList("3");
				}else{
					if(remaining < 0){
						printCoinList();
						continue;
					}else{
						System.out.println("remaining = "+ remaining);
						changeTray=cmdo.coinChangeReturn();
						for(IMoney coinKey : changeTray.keySet()){
							if(changeTray.get(coinKey)!=0)
								output=output+coinKey.getName()+" = "+changeTray.get(coinKey) +" coin(s)\t\t";
								System.out.print(coinKey.getName()+" = "+changeTray.get(coinKey) +" coin(s)\t\t"); 
						}
						break;
					}
				}
			}
		 //
		 String message="";
		 assertEquals(message,output);
	   }
	 
	 
	 @Test
	 public void testColaOneQuarterRemain() {
		 while(true){
				remaining = cmdo.balanceCheck();
				if (remaining==null){
					printProductList("3");
				}else{
					if(remaining< 0){
						printCoinList();
						cmdo.insertCoin(new Quarter());
						continue;
					}else{
						System.out.println("remaining = "+ remaining);
						printCoinTray();
						break;
					}
				}
			}
		 //
		 String message="Quarter = 1 coin(s)\t\t";
		 assertEquals(message,output);
	   }
	 
	 public void printProductList(String input){
		//TODO mention options
			System.out.println("Enter Product");
			System.out.println("1. Candy ");
			System.out.println("2. Chips ");
			System.out.println("3. Cola ");
			cmdo.selectProduct(input);
	 	}
	 
	 public void printCoinList(){
				//TODO mention options
			 	System.out.println("Insert coin");
				System.out.println("Penny");
				System.out.println("Nickle");
				System.out.println("Dime");
				System.out.println("Quarter");
				for(IMoney coinKey: inputCoinTray.keySet()){
					for(int i=0; i<inputCoinTray.get(coinKey);i++)
						cmdo.insertCoin(coinKey);
				}
		 }
	 public void printCoinTray(){
		 changeTray=cmdo.coinChangeReturn();
			//System.out.println("pennies = "+changeTray.get(new Penny()));
			for(IMoney coinKey : changeTray.keySet()){
				if(changeTray.get(coinKey)!=0)
					output=output+coinKey.getName()+" = "+changeTray.get(coinKey) +" coin(s)\t\t";
					System.out.print(coinKey.getName()+" = "+changeTray.get(coinKey) +" coin(s)\t\t"); 
			}
	 }
}
