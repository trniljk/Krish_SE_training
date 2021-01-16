package com.ishara.odering_system;

import com.ishara.odering_system.exeptions.BrandNotAvailableException;
import com.ishara.odering_system.exeptions.ItemNotAvailableException;

public class Oder {
	
	 public void getOder() throws Exception{
	        try {
	            Brand brand = new Brand();
	            brand.checkRequstedBrand();
	        } catch (BrandNotAvailableException e) {
	            throw new ItemNotAvailableException("Couse by getOder" , e); 
	        }
	        
	 }

}
