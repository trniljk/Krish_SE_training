package com.ishara.designpatterns.prototype;

public class DoubleBedRoom extends HotelRoom{
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

	@Override
	public String toString() {
		return "DoubleBedRoom [type=" + type + ", BedArangment=" + getBedArangment() + "]";
	}
    
    
    
}