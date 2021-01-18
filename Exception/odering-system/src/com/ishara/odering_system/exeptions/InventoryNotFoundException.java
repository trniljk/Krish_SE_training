package com.ishara.odering_system.exeptions;

import java.io.FileNotFoundException;
import java.io.IOException;

public class InventoryNotFoundException extends InventoryException{
	public InventoryNotFoundException( String messgae,Exception e) {
		super( messgae, e);
		
	}

}
