package com.ishara.odering_system.exeptions;

public class InvalidInventoryReadingException extends InventoryException{

	public InvalidInventoryReadingException(String messgae, Exception e) {
		super( messgae, e);
	}
}
