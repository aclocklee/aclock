package com.gupaolearn.abstractfactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {
        LenovelFactory factory = new LenovelFactory();
        factory.checkValue().check();
        factory.productThing().product();

        MeideaFactory mFactory = new MeideaFactory();
        mFactory.checkValue().check();
        mFactory.productThing().product();
    }
}
