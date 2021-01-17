package com.ishara.odering_system;

import com.ishara.odering_system.exeptions.*;
import java.io.*;
import java.util.Scanner;

import javax.management.RuntimeErrorException;


public class Store {
	
	
	public static int maxStorageForItem = 1000;
	
	void checkAvailableQty() throws Exception{
        
            throw new QtyExceedException("Requsted Qty not available");        
    }
	
	public void previewInventory(){
		try {
			FileInputStream fill = null;
            fill= new FileInputStream("E:/inventory.txt");  
		} catch (FileNotFoundException e) {
			System.out.println("Check Exception ::" + e);
		}
	}
	
	public void showRemainQtyOf(String itemCode) {
		
		int itemCount;
		try {
			File inventryFile = new File("C:\\Users\\Night_King\\Documents\\projects\\Virtusa-LP-Training-Extented\\Exception\\odering-system\\resources\\Inventry.txt");
			
			Scanner scanFile = new Scanner(inventryFile); 
			
			itemCount = Integer.parseInt(scanFile.nextLine());
			System.out.println("Vailable Count of "+itemCode+ "-" + itemCount);
		}
		catch (FileNotFoundException e){
			System.out.println(e);			
		}
				
	}
	public void setInventoryOf(String itemCode,int qty){
		
		try {
			
			if(qty> Store.maxStorageForItem) {
				throw new InsufficientStorageException();
			}
			
		} catch (InsufficientStorageException e) {
			
			throw new RuntimeException(e);
			
		}
		

	}
	
}
