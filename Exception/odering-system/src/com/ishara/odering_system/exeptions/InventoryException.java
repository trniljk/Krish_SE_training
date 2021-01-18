package com.ishara.odering_system.exeptions;

public class InventoryException extends Exception{
	

	public InventoryException(String messgae, Exception e) {
		super(messgae,e);
	}
}
