package com.ishara.odering_system;

import java.io.FileNotFoundException;

import com.ishara.odering_system.exeptions.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Oder newOder = new Oder();
            newOder.getOder();
        } catch (Exception e) {
              System.out.println(e);
        }
		
			
		Store store = new Store();
		store.previewInventory();		
		store.getInventry("R123");
		try {
			store.setInventory("R123",2000);
		} catch (RuntimeException e) {
			System.out.println(e);
		}		
	}

}
