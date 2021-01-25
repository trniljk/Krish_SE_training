package com.ishara.designpatterns.factorymethod;

public class IceCreamFactory {
	public static IceCream createIceCream(IceCreamType iceCreamtype){
        switch (iceCreamtype){
        
        case VANILA:
            return new VanilaIceCream();
        case CHOCOLATE:
            return new ChocolateIceCream();
        case PANIKAJU:
            return new PaniKajuIceCream();    
        default:
            return null;
        }
    } 
}
