package com.ishara.designpatterns.factorymethod;

public class PaniKajuIceCream extends IceCream{
    @Override
    protected void createIceCream(){
        ingredients.add(new IceCreamMixer());
        ingredients.add(new Vanila());
        ingredients.add(new Honey());
        ingredients.add(new CashewNut());
    }
}