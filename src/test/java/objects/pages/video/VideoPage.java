package objects.pages.video;

import objects.base.PageBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static common.WebBrowser.webBrowser;
import static objects.pages.video.VideoLocators.*;

public class VideoPage extends PageBase {


    public boolean isCorrectSrcAndDuration() {
        WebElement videoPlayer = find(VIDEO_PLAYER);
        JavascriptExecutor jse = (JavascriptExecutor) webBrowser();
        double duration = (Double) jse.executeScript("return arguments[0].duration", videoPlayer);
        System.out.println("duration = " + duration);
        return duration == BDD_VIDEO_DURATION;
    }

    public void waitUntilVideoReady() {
        new WebDriverWait(webBrowser(), Duration.ofSeconds(5))
            .until(ExpectedConditions.visibilityOfElementLocated(COMMENTS));
    }
}
