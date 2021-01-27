package com.ishara.designpatterns.prototype;

import javax.management.RuntimeErrorException;

public class FamilySuite extends HotelRoom{
    private String type;
    private int noOfPersons;
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPersons() {
    
        return noOfPersons;
    }

    public void setPersons(int noOfPersons) {
  	
        this.noOfPersons = noOfPersons;
    }

	@Override
	public String toString() {
		return "FamilySuite [type=" + type + ", noOfPersons=" + noOfPersons + ", BedArangment=" + getBedArangment()
				+ "]";
	}
    
    
}
