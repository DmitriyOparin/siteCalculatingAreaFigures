package ru.ngtu.ci.tests;

import org.junit.Assert;
import org.junit.Test;

public class SquareCircleTests extends TestBase {

    @Test
    public void squareCircleTest(){
        app.setValueRadiusCircle("4");
        String result = app.getSquareCircle();
        Assert.assertEquals("50,3", result);
    }

    @Test
    public void squareEmptyRadiusCircleTest(){
        app.setValueRadiusCircle("");
        String result = app.getSquareCircle();
        Assert.assertEquals("Введите коректнные значения", result);
    }
}
