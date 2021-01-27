package com.ishara.designpatterns.prototype;

import java.util.HashMap;
import java.util.Map;

public class RoomCategory {
    
    private Map<RoomType,HotelRoom> hotelRooms = new HashMap<RoomType, HotelRoom>();

    public RoomCategory() {
        inizializing();
        
    }
    
    public HotelRoom getHotelRoom(RoomType roomType){
    
        HotelRoom hotelRoom = null;
       
        try {
			hotelRoom = (HotelRoom)hotelRooms.get(roomType).clone();
		} catch (CloneNotSupportedException e) {
			
			System.out.println(e);
		}
        return hotelRoom;
    }
    private void inizializing() {
        
        DoubleBedRoom doubleBedRoom = new DoubleBedRoom();
        doubleBedRoom.setType("Deluxe Room");
        doubleBedRoom.setBedArangment("Large Double Bed");
        doubleBedRoom.setBathroomType("Personal Bath Room with Bath Tub");
        
        TripleBedRoom tripleBedRoom = new TripleBedRoom();
        tripleBedRoom.setType("Deluxe Twin Room");
        tripleBedRoom.setBedArangment("Three Single Beds");
        tripleBedRoom.setBathroomType("Personal Bathroom");
        
        FamilySuite familySuite  = new FamilySuite();
        familySuite.setType("Lake View Suite");
        familySuite.setPersons(6);
        familySuite.setBedArangment("Two Double Beds and Two Single Beds ");
        
        hotelRooms.put(RoomType.DOUBLE, doubleBedRoom);
        hotelRooms.put(RoomType.TRIPLE, tripleBedRoom);
        hotelRooms.put(RoomType.FAMILY, familySuite);
    }
    
    
}

