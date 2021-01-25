package com.ishara.designpatterns.builder;

public class BookingPackege {
	
	
	private final  String bookingType;
    private final String breakfastMenuType;
    private final String lunchfastMenuType;
    private final String dinnerMenuType;
    private final String mealType;
    private final String cosmetics;

    private BookingPackege(Builder builder) {
         this.cosmetics = builder.cosmetics;
         this.bookingType =builder.bookingType;
         this.breakfastMenuType = builder.breakfastMenuType;
         this.dinnerMenuType = builder.dinnerMenuType;
         this.lunchfastMenuType = builder.lunchfastMenuType;
         this.mealType = builder.mealType;
    }
   
    static public class Builder{
    	
        private String bookingType;
        private String breakfastMenuType;
        private String lunchfastMenuType;
        private String dinnerMenuType;
        private String mealType;
        private String cosmetics;

        public Builder(String bookingType) {
            this.bookingType = bookingType;
        }
        
        public BookingPackege build(){
            return new BookingPackege(this);
        }
        
        
        public Builder breakfastMenuType(String breakfastMenuType){
            this.breakfastMenuType =breakfastMenuType;
            return this;
        }
        public Builder lunchMenuType(String lunchfastMenuType){
            this.lunchfastMenuType = lunchfastMenuType;
            return this;
        }
        public Builder dinnerMenuType(String dinnerMenuType){
            this.dinnerMenuType = dinnerMenuType ;
            return this;
        }
        public Builder mealType(String mealType){
            this.mealType =mealType;
            return this;
        }
        public Builder cosmetics(String cosmetics){
            this.cosmetics = cosmetics;
            return this  ;
        }
        
        
    }

    @Override
    public String toString() {
        return "BookingPackege{" + "bookingType=" + bookingType + ", breakfastMenuType=" + breakfastMenuType + ", lunchfastMenuType=" + lunchfastMenuType + ", dinnerMenuType=" + dinnerMenuType + ", mealType=" + mealType + ", cosmetics=" + cosmetics + '}';
    }

}
