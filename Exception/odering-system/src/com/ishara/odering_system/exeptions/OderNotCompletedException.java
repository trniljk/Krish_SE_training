package com.ishara.odering_system.exeptions;

public class OderNotCompletedException extends Exception{
	public OderNotCompletedException(String messgae,Exception e) {
		super(messgae,e);
		
	}
}
