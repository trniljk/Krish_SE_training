package com.ishara.odering_system;

import com.ishara.odering_system.exeptions.*;

public class Brand {
	
	public void checkRequstedBrand() throws Exception{
        try {
            ItemColor itemColor = new ItemColor();
            itemColor.checkRequstedColor();
        } catch (ColorNotAvailableException e) {
            throw new BrandNotAvailableException("Couse by checkAvailableBrand" , e); 
        }

    } 

}
