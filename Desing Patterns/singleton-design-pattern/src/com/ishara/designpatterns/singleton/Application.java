package com.ishara.designpatterns.singleton;

import com.ishara.desingpatterns.audiosystem.*;

public class Application {

	public static void main(String[] args) {
		 AudioSystemSettings audioSystemSettings = AudioSystemSettings.getSystemSetting();      
	     System.out.println(audioSystemSettings.displaySettings());
	        
	     AudioSystemSettings audioSystemSettings2 = AudioSystemSettings.getSystemSetting();
	     audioSystemSettings2.setVolume(20);
	     audioSystemSettings2.setBass(30);
	        
	     System.out.println(audioSystemSettings.displaySettings()); 
	}

}
