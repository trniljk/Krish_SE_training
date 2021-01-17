package com.ishara.odering_system.storeManagement;
import com.ishara.odering_system.*;


public class Application {

	public static void main(String[] args) {
		Store store = new Store();
		
			//store.previewInventory();			
		
			//store.showRemainQtyOf("R123"); 
		
			store.setInventoryOf("R123",2000);

	}

}
