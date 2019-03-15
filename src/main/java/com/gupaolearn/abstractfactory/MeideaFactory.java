package com.gupaolearn.abstractfactory;

public class MeideaFactory implements ProductFactoryInterface {
    public CheckValueInterface checkValue() {
        return new MeideaCheck();
    }

    public ProductInterface productThing() {
        return new MeideaProduct();
    }
}
