package com.gupaolearn.factorymethod;

import com.gupaolearn.simplefatory.SimpleFactoryInterface;
import com.gupaolearn.simplefatory.StudentSimpleFactory;

public class StudentFactoryMethod implements FactotyMethodInterface {
    public SimpleFactoryInterface create() {
        return new StudentSimpleFactory();
    }
}
