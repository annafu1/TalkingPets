package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Pet.Dog;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class DogTest {

    @Test
    public void dogConstructTest(){
        Dog dog = new Dog("doggie");
        String actual = dog.speak();
        String expected = "Ruff";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dogNullaryTest(){
        Dog dog = new Dog();
        String actual = dog.speak();
        String expected = "Ruff";
        Assert.assertEquals(expected, actual);
    }
}
