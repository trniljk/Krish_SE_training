package com.ishara.designpatterns.factorymethod;

public class ChocolateIceCream extends IceCream{
    
    @Override
    protected void createIceCream(){
        ingredients.add(new IceCreamMixer());
        ingredients.add(new Chocolate());
    }    
}
