package ru.ngtu.ci.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RectanglePage extends Page {
    public RectanglePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }
    @FindBy(name="sideA")
    public WebElement firstSideInput;

    @FindBy(name="sideB")
    public WebElement secondSideInput;

    @FindBy(name="calculate")
    public WebElement calculate;

    @FindBy(name="result")
    public WebElement result;

    public void open() {
        driver.get("http://localhost:5000/rectangle");
    }
}
