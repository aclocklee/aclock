package com.gupaolearn.factorymethod;

import com.gupaolearn.simplefatory.SimpleFactoryInterface;
import com.gupaolearn.simplefatory.TeachSimpleFactory;

public class TecherFactoryMethod implements FactotyMethodInterface {
    public SimpleFactoryInterface create() {
        return new TeachSimpleFactory();
    }
}
