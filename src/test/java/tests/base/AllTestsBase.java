package tests.base;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import java.util.concurrent.TimeUnit;

import static common.WebBrowser.webBrowser;
import static common.WebBrowser.closeWebBrowser;

public class AllTestsBase {

    @BeforeMethod
    protected void prepareDriver() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        webBrowser().manage().window().maximize();
        webBrowser().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }



    @AfterMethod(alwaysRun = true)
    protected void quitDriver() {
        closeWebBrowser();
    }
}
