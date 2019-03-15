package com.gupaolearn.factorymethod;

import com.gupaolearn.simplefatory.SimpleFactoryInterface;

public class FactoryMethodTest {
    public static void main(String[] args) {
        FactotyMethodInterface method = new StudentFactoryMethod();
        SimpleFactoryInterface factory = method.create();
        factory.sayHellowWord();
        method = new TecherFactoryMethod();
        factory = method.create();
        factory.sayHellowWord();
    }
}
