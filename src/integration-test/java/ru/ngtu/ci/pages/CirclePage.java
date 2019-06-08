package ru.ngtu.ci.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CirclePage extends Page {
    public CirclePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(name="radius")
    public WebElement radiusInput;

    @FindBy(name="calculate")
    public WebElement calculate;

    @FindBy(name="result")
    public WebElement result;

    public void open() {
        driver.get("http://localhost:5000/circle");
    }
}
