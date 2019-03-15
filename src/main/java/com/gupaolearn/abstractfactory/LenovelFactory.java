package com.gupaolearn.abstractfactory;

public class LenovelFactory implements ProductFactoryInterface {
    public CheckValueInterface checkValue() {
        return new LenovelCheck();
    }

    public ProductInterface productThing() {
        return new LenovelProduct();
    }
}
