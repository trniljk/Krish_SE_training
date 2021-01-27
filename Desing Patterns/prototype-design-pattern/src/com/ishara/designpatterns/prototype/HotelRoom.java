package com.ishara.designpatterns.prototype;

public abstract class HotelRoom implements Cloneable{
    private String bathroomType;
    private String bedArangment;

    public String getBathroomType() {
        return bathroomType;
    }

    public void setBathroomType(String bathroomType) {
        this.bathroomType = bathroomType;
    }

    public String getBedArangment() {
        return bedArangment;
    }

    public void setBedArangment(String bedArangment) {
        this.bedArangment = bedArangment;
    }

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
    
}
