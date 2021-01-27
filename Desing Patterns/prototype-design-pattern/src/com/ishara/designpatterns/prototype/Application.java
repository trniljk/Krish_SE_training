package com.ishara.designpatterns.prototype;

public class Application {

	public static void main(String[] args) {
		
        RoomCategory roomCategory = new RoomCategory();
        
        DoubleBedRoom booking1 = (DoubleBedRoom)roomCategory.getHotelRoom(RoomType.DOUBLE);
        booking1.setType("Deluxe King Room");
        booking1.setBedArangment("Two Single Beds");
        
        TripleBedRoom booking2 = (TripleBedRoom)roomCategory.getHotelRoom(RoomType.TRIPLE);
        
        System.out.println(booking1);
        System.out.println(booking2);

	}

}
