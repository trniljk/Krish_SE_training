package com.ishara.odering_system;

import com.ishara.odering_system.exeptions.*;

public class ItemColor {
	
	void checkRequstedColor() throws ColorNotAvailableException{
        try {
            Store requstedQty = new Store();
            requstedQty.checkAvailableQty();            
        } catch (QtyExceedException e) {
            throw new ColorNotAvailableException("Requsted color not Available for selected brand" , e); 
        } 
    }
}
