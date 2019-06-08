package ru.ngtu.ci.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.ngtu.ci.CalculationSquare;

public class UnitTests {
    @Test
    public void squareRectangleTest(){
        String result = CalculationSquare.calculationSquareRectangle("2","2");
        System.out.println(result);
        Assert.assertEquals("4,0", result);
    }

    @Test
    public void squareZeroRectangleTest(){
        String result = CalculationSquare.calculationSquareRectangle("0","0");
        System.out.println(result);
        Assert.assertEquals("0,0", result);
    }

    @Test
    public void squareCircleTest(){
        String result = CalculationSquare.calculationSquareCircle("2");
        System.out.println(result);
        Assert.assertEquals("12,6", result);
    }

    @Test
    public void squareZeroCircleTest(){
        String result = CalculationSquare.calculationSquareCircle("0");
        System.out.println(result);
        Assert.assertEquals("0,0", result);
    }
}