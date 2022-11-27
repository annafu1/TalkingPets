package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Pet.Cat;
import io.zipcoder.polymorphism.Pet.Dog;
import io.zipcoder.polymorphism.Pet.Pet;
import io.zipcoder.polymorphism.Pet.Rat;

import java.util.ArrayList;
import java.util.Scanner;

import static io.zipcoder.polymorphism.MainApplication.petCreation;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many pets do you have?:\n");
        int numOfPets = scanner.nextInt();
        scanner.nextLine();

        ArrayList<Pet> petList = new ArrayList<Pet>();

        for (int i = 0; i < numOfPets; i++) {
            System.out.println("What's the name of pet #" + (i + 1) + ":");
            String name = scanner.nextLine();
            System.out.println("What's the kind of pet #" + (i + 1) + ":");
            String kind = scanner.nextLine();
            petList.add(petCreation(name, kind));
        }

        for(Pet pet : petList) {
            System.out.println(pet.getName() + " says " + pet.speak());
        }


    }
    public static Pet petCreation(String name, String kind) {
            if (kind.equalsIgnoreCase("cat")) {
                return new Cat(name);
            } else if (kind.equalsIgnoreCase("dog")) {
                return new Dog(name);
            } else if (kind.equalsIgnoreCase("rat")) {
                return new Rat(name);
            } else {
                System.out.println("No pet exists");
                return null;
            }
        }
}
