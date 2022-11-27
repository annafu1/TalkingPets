package io.zipcoder.polymorphism;
import io.zipcoder.polymorphism.Pet.Pet;
import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void petNullaryTest() {
        Pet pet = new Pet();
        String actual = pet.setName();
        String expected = null;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void speakTest() {
        Pet pet = new Pet("Seaweed");

        String expected = "";
        String actual = pet.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest() {
        Pet pet = new Pet("Woofie");

        String expected = "Woofie";
        String actual = pet.getName();

        Assert.assertEquals(expected, actual);
    }

}
