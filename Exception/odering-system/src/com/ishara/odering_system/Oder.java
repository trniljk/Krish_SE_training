package com.ishara.odering_system;

import com.ishara.odering_system.exeptions.*;


public class Oder {
	
	 public void getOder() throws OderNotCompletedException{
	        try {
	            Brand brand = new Brand();
	            brand.checkRequstedBrand();
	        } catch (BrandNotAvailableException e) {
	            throw new OderNotCompletedException("Requsted oder Can not Completed" , e); 
	        }
	        
	 }

}
