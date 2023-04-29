package objects.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;

import static common.WebBrowser.webBrowser;

public class PageBase {

    public void closePopUpWindow() {
        new WebDriverWait(webBrowser(), Duration.ofSeconds(5)).until(ExpectedConditions.numberOfWindowsToBe(2));
        webBrowser().switchTo().window(webBrowser().getWindowHandles().toArray()[1].toString());
        webBrowser().close();
        webBrowser().switchTo().window(webBrowser().getWindowHandles().toArray()[0].toString());
    }

    protected static void click(By link) {
        find(link).click();
    }

    protected static WebElement find(By link) {
        return webBrowser().findElement(link);
    }

    protected static SearchContext getShadowRoot (WebDriver driver, WebElement root) {
        return (SearchContext) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot", root);
    }

    public void takeScreenshot() {
//        //JUST A 1 SEC PAUSE BEFORE TAKE A SCREENSHOT, TO ALLOW PREVIOUS SCRIPT FINISH IT WORK
//        new WebDriverWait(webBrowser(), Duration.ofSeconds(1)).until(ExpectedConditions.numberOfWindowsToBe(2));

        File srcFile = ((TakesScreenshot)webBrowser()).getScreenshotAs(OutputType.FILE);

        String fileName = new StringBuilder()
            .append(this.getClass().getName())
            .append(new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date()))
            .toString();

        try {
            FileUtils.copyFile(srcFile, new File(fileName + ".jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
