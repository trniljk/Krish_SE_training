package com.ishara.odering_system;

import com.ishara.odering_system.exeptions.*;

public class Brand {
	
	public void checkRequstedBrand() throws BrandNotAvailableException{
        try {
            ItemColor itemColor = new ItemColor();
            itemColor.checkRequstedColor();
        } catch (ColorNotAvailableException e) {
            throw new BrandNotAvailableException("Couse by checkAvailableBrand" , e); 
        }

    } 
	
	public int cccc() throws BrandNotAvailableException{
		
		int x = 0;
		try {
			return x;
		} catch (Exception e) {
			return x;
		}
		
	}
}
