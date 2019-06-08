package ru.ngtu.ci;

public class CalculationSquare {
    public String calculationSquareRectangle(String sideA, String sideB){
        double sideADouble = Double.parseDouble(sideA);
        double sideBDouble = Double.parseDouble(sideB);
        double resultDouble = sideADouble*sideBDouble;
        return String.format("%.1f", resultDouble);
    }

    public String calculationSquareCircle(String radius){
        double radiusDouble = Double.parseDouble(radius);
        double resultDouble = Math.PI*radiusDouble*radiusDouble;
        return String.format("%.1f", resultDouble);
    }
}
