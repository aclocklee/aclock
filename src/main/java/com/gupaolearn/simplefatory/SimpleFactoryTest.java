package com.gupaolearn.simplefatory;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        PersonSimpleFactory factory = new PersonSimpleFactory();
        SimpleFactoryInterface simpleFactory = factory.create(StudentSimpleFactory.class);
        simpleFactory.sayHellowWord();
        simpleFactory = factory.create(TeachSimpleFactory.class);
        simpleFactory.sayHellowWord();
    }
}
