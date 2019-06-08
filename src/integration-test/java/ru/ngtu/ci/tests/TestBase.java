package ru.ngtu.ci.tests;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import ru.ngtu.ci.app.Application;


public class TestBase {
    public static Application app;

    @BeforeClass
    public static void setUp() {
        app = new Application();
    }

    @AfterClass
    public static void tearDown() {
        app.quit();
    }

}
