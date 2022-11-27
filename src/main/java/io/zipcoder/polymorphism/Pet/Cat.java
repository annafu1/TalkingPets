package io.zipcoder.polymorphism.Pet;

public class Cat extends Pet{
    public Cat(String name) {

        super(name);
    }

    public Cat() {

        super("");
    }

    public String speak() {
        return "Meow";
    }
}
