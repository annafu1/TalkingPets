package io.zipcoder.polymorphism.Pet;

public class Pet{
        String name;

        public Pet() {
            name = "";
        }

        public Pet(String name) {
            this.name = name;
        }

        public String speak() {
            return "";
        }
        public String getName() {
            return name;
        }

    public String setName() {
        return null;
    }
}
