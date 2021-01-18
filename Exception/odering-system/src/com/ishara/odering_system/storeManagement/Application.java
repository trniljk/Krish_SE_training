package com.ishara.odering_system.storeManagement;
import com.ishara.odering_system.*;
import com.ishara.odering_system.exeptions.InventoryNotFoundException;


public class Application {

	public static void main(String[] args) {
		Store store = new Store();
		
			try {
				
				store.previewInventory();
			} catch (InventoryNotFoundException e) {
				
				System.out.println(e);
			}
		
			try {
				
				store.showRemainQtyOf("R123");
				
			} catch (InventoryNotFoundException e) {
				
				System.out.println(e);	
				
			} 
		
			store.setInventoryOf("R123",2000);

	}

}
