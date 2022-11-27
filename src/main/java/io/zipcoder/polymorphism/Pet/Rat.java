package io.zipcoder.polymorphism.Pet;

public class Rat extends Pet {

    public Rat(String name) {

        super(name);
    }

    public Rat() {

        super("");
    }

    public String speak() {
        return "tsk";
    }
}
