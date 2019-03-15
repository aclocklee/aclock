package com.gupaolearn.simplefatory;

public class PersonSimpleFactory {
    public SimpleFactoryInterface create(Class<? extends SimpleFactoryInterface> clazz){
        try {
            if(clazz!=null){
                return clazz.newInstance();
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
