package com.ishara.odering_system;

import java.io.FileNotFoundException;

import com.ishara.odering_system.exeptions.*;

public class Application {

	public static void main(String[] args) {
		try {
            Oder newOder = new Oder();
            newOder.getOder();
        } catch (OderNotCompletedException e) {
        	
           e.printStackTrace();  
        }
			
	}

}
