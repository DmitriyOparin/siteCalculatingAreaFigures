package ru.ngtu.ci.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.ngtu.ci.controller.SquareController;


public class UnitTests {
    @Test
    public void squareRectangleTest(){
        SquareController squareController = new SquareController();
        String result = squareController.calculationSquareRectangle("2","2");
        Assert.assertEquals("4,0", result);
    }

    @Test
    public void squareZeroRectangleTest(){
        SquareController squareController = new SquareController();
        String result = squareController.calculationSquareRectangle("0","0");
        Assert.assertEquals("0,0", result);
    }

    @Test
    public void squareCircleTest(){
        SquareController squareController = new SquareController();
        String result = squareController.calculationSquareCircle("2");
        Assert.assertEquals("12,6", result);
    }

    @Test
    public void squareZeroCircleTest(){
        SquareController squareController = new SquareController();
        String result = squareController.calculationSquareCircle("0");
        Assert.assertEquals("0,0", result);
    }
}
