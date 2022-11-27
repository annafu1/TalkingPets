package io.zipcoder.polymorphism;

import io.zipcoder.polymorphism.Pet.Rat;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class RatTest {

    @Test
    public void RatConstructTest(){
        Rat rat = new Rat("ratty");
        String actual = rat.speak();
        String expected = "tsk";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void RatnullaryTest(){
        Rat rat = new Rat();
        String actual = rat.speak();
        String expected = "tsk";
        Assert.assertEquals(expected, actual);
    }
}
