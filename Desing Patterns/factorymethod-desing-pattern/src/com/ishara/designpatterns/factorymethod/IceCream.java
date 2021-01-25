package com.ishara.designpatterns.factorymethod;

import java.util.List;
import java.util.ArrayList;


public abstract class IceCream {
    protected List<Ingredients> ingredients = new ArrayList<> ();
    public IceCream(){
        createIceCream();
    }    
    protected abstract void createIceCream();
    
    @Override
    public  String toString(){
        
        return getClass().getSimpleName()+" ( Ingrediant = " + ingredients+")";
    }
}