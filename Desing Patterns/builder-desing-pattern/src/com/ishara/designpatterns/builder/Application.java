package com.ishara.designpatterns.builder;

public class Application {

	public static void main(String[] args) {
		
		BookingPackege.Builder builder= new BookingPackege.Builder("Half Board");
		   
	    BookingPackege booking1 =  builder.breakfastMenuType("Italian").dinnerMenuType("Sri lankan").mealType("Vegan").cosmetics("Herbal").build();
	     
	    System.out.println(booking1);    

	}

}
