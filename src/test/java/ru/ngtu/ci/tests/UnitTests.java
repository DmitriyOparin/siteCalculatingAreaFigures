package ru.ngtu.ci.tests;

import org.junit.Assert;
import org.junit.Test;
import ru.ngtu.ci.CalculationSquare;

public class UnitTests {
    @Test
    public void squareRectangleTest() {
        CalculationSquare calculationSquare = new CalculationSquare();
        String expected_result = "4,0";
        String actual_result = calculationSquare.calculationSquareRectangle("2", "2");
        System.out.println(actual_result);
//        Assert.assertEquals("4,0", result);
        Assert.assertEquals(expected_result, actual_result);
    }

    @Test
    public void squareZeroRectangleTest() {
        CalculationSquare calculationSquare = new CalculationSquare();
        String expected_result = "0,0";
        String actual_result = calculationSquare.calculationSquareRectangle("0", "0");
        System.out.println(actual_result);
//        Assert.assertEquals("0,0", result);
        Assert.assertEquals(expected_result, actual_result);
    }

    @Test
    public void squareCircleTest() {
        CalculationSquare calculationSquare = new CalculationSquare();
        String expected_result = "12,6";
        String actual_result = calculationSquare.calculationSquareCircle("2");
        System.out.println(actual_result);
//        Assert.assertEquals("12,6", result);
        Assert.assertEquals(expected_result, actual_result);
    }


    @Test
    public void squareZeroCircleTest() {
        CalculationSquare calculationSquare = new CalculationSquare();
        String expected_result = "0,0";
        String actual_result = calculationSquare.calculationSquareCircle("0");
        System.out.println(actual_result);
        Assert.assertEquals(expected_result, actual_result);
    }


    @Test
    public void testTest() {
        System.out.println("result");
        Assert.assertEquals("result", "result");





    }
}