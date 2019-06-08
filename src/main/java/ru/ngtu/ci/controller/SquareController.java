package ru.ngtu.ci.controller;

import ru.ngtu.ci.CalculationSquare;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SquareController {
    @GetMapping
    public String startPage() {
        return "main";
    }

    @GetMapping("/main")
    public String main() {
        return "main";
    }

    @GetMapping("/circle")
    public String openPageSquareCircle() {
        return "circle";
    }

    @GetMapping("/rectangle")
    public String openPageSquareRectangle() {
        return "rectangle";
    }

    @PostMapping("rectangle")
    public String squareRectangle(@RequestParam String sideA, @RequestParam String sideB, Model model){
        if (sideA != null && !sideA.isEmpty() && sideB != null && !sideB.isEmpty()){
            String resultFormatString = CalculationSquare.calculationSquareRectangle(sideA, sideB);
            model.addAttribute("squareRectangle",resultFormatString);
        } else {
            model.addAttribute("squareRectangle","Введите коректнные значения");
        }
        return "rectangle";
    }

    @PostMapping("circle")
    public String squareCircle(@RequestParam String radius, Model model){
        if (radius != null && !radius.isEmpty()){
            String resultFormatString = CalculationSquare.calculationSquareCircle(radius);
            model.addAttribute("squareCircle",resultFormatString);
        } else {
            model.addAttribute("squareCircle","Введите коректнные значения");
        }
        return "circle";
    }


}
