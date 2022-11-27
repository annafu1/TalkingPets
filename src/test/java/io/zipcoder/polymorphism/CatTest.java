package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Pet.Cat;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class CatTest {
    @Test
    public void catNullaryTest(){
        Cat cat = new Cat();
        String actual = cat.speak();
        String expected = "Meow";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catConstructTest(){
        Cat cat = new Cat("catty");
        String actual = cat.speak();
        String expected = "Meow";
        Assert.assertEquals(expected, actual);
    }

}
