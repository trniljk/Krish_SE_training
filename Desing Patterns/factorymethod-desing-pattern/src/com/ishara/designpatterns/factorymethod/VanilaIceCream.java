package com.ishara.designpatterns.factorymethod;

public class VanilaIceCream extends IceCream{
    @Override
    protected void createIceCream(){
        ingredients.add(new IceCreamMixer());
        ingredients.add(new Vanila());
    }
}
