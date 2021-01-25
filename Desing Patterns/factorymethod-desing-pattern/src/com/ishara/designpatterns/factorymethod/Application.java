package com.ishara.designpatterns.factorymethod;

public class Application {

	public static void main(String[] args) {
		IceCream icecream = IceCreamFactory.createIceCream(IceCreamType.VANILA);
        System.out.println(icecream);
        
        IceCream icecream2 = IceCreamFactory.createIceCream(IceCreamType.PANIKAJU);
        System.out.println(icecream2);
	}

}
