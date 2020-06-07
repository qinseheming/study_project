package com.study.design_model.factory;

public class Client {

    public static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal("dog");
        animal.speak();

        Animal animal1 = AnimalFactory2.getAnimal(Dog.class);
        animal1.speak();
    }
}
