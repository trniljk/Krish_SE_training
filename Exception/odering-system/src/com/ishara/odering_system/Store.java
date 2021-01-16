package com.ishara.odering_system;

import com.ishara.odering_system.exeptions.*;
import java.io.*;
import java.util.Scanner;

import javax.management.RuntimeErrorException;


public class Store {
	
	
	
	void checkAvailableQty() throws Exception{
        
            throw new QtyExceedException("Requsted Qty not available");        
    }
	
	public void previewInventory(){
		try {
			FileInputStream fill = null;
            fill= new FileInputStream("E:/myfile.txt");  
		} catch (FileNotFoundException e) {
			System.out.println("Check Exception -" + e);
		}
	}
	
	public void getInventry(String itemCode) {
		
		int itemCount;
		try {
			File inventryFile = new File("C:\\Users\\Night_King\\Documents\\eclipse-workspace\\odering-system\\resources\\Inventry.txt");
			
			Scanner scanFile = new Scanner(inventryFile); 
			
			itemCount = Integer.parseInt(scanFile.nextLine());
			System.out.println("Vailable Count of "+itemCode+ "-" + itemCount);
		}
		catch (Exception e)
		{
			System.out.println("Uncheck Exception -" + e);
		}			
	}
	public void setInventory(String itemCode,int qty) throws  RuntimeException{
		
		try {
			
			if(qty> 1000) {
				throw new InsufficientStorageException();
			}
			
		} catch (InsufficientStorageException e) {
			
			throw new RuntimeException("Exception wrapping -"+ e);
			// TODO: handle exception
		}
		// TODO Auto-generated method stub

	}
	
}
