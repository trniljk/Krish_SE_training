package com.ishara.odering_system.exeptions;

public class InsufficientStorageException extends Exception{
	public InsufficientStorageException() {
		super("Storage not enough");
		
	}
	
}