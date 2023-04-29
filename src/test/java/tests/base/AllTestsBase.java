package tests.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

import static common.WebBrowser.webBrowser;
import static common.WebBrowser.closeWebBrowser;

public class AllTestsBase {

    protected SoftAssert soft;

    @BeforeMethod
    protected void prepareDriver() {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        webBrowser().manage().window().maximize();
        webBrowser().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        soft = new SoftAssert();
    }



    @AfterMethod(alwaysRun = true)
    protected void quitDriver() {
        closeWebBrowser();
    }
}
