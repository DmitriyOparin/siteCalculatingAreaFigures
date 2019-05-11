package ru.ngtu.ci.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import ru.ngtu.ci.pages.CirclePage;
import ru.ngtu.ci.pages.MainPage;
import ru.ngtu.ci.pages.RectanglePage;

public class Application {
    private WebDriver driver;

    private MainPage mainPage;
    private RectanglePage rectanglePage;
    private CirclePage circlePage;

    public Application() {
        System.setProperty("webdriver.gecko.driver", "src/tools/geckodriver.exe");
        driver = new FirefoxDriver();
        mainPage = new MainPage(driver);
        rectanglePage = new RectanglePage(driver);
        circlePage = new CirclePage(driver);
    }

    public void quit() {
        driver.quit();
    }

    public void setValueSidesRectangle(String sideA, String sideB) {
        rectanglePage.open();
        rectanglePage.firstSideInput.sendKeys(sideA);
        rectanglePage.secondSideInput.sendKeys(sideB);
        rectanglePage.calculate.click();
    }

    public void setValueRadiusCircle(String radius) {
        circlePage.open();
        circlePage.radiusInput.sendKeys(radius);
        circlePage.calculate.click();
    }

    public String getSquareRectangle() {
        return rectanglePage.result.getText();
    }

    public String getSquareCircle() {
        return circlePage.result.getText();
    }

    public String openAndGetTitleMainPage() {
        mainPage.open();
        return mainPage.getTitlePage();
    }

    public String transitionAndGetTitleRectanglePage() {
        mainPage.rectangleLink.click();
        return rectanglePage.getTitlePage();
    }

    public String transitionAndGetTitleCirclePage() {
        mainPage.circleLink.click();
        return circlePage.getTitlePage();
    }

    public String transitionAndGetTitleMainPage() {
        mainPage.mainLink.click();
        return mainPage.getTitlePage();
    }
}