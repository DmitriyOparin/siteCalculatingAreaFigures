package ru.ngtu.ci.controller;

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
    public String squareCircle() {
        return "circle";
    }

    @GetMapping("/rectangle")
    public String squareRectangle() {
        return "rectangle";
    }

    @PostMapping("rectangle")
    public String squareRectangle(@RequestParam String sideA, @RequestParam String sideB, Model model){
        if (sideA != null && !sideA.isEmpty() && sideB != null && !sideB.isEmpty()){
            double sideADouble = Double.parseDouble(sideA);
            double sideBDouble = Double.parseDouble(sideB);
            double resultDouble = sideADouble*sideBDouble;
            String resultString = String.valueOf(resultDouble);
            model.addAttribute("squareRectangle",resultString);
        } else {
            model.addAttribute("squareRectangle","Введите коректнные значения");
        }
        return "rectangle";
    }

    @PostMapping("circle")
    public String squareCircle(@RequestParam String radius, Model model){
        if (radius != null && !radius.isEmpty()){
            double radiusDouble = Double.parseDouble(radius);
            double resultDouble = Math.PI*radiusDouble*radiusDouble;
            String resultString = String.valueOf(resultDouble);
            model.addAttribute("squareCircle",resultString);
        } else {
            model.addAttribute("squareCircle","Введите коректнные значения");
        }
        return "circle";
    }

// comment for travis, you can to delete

}
