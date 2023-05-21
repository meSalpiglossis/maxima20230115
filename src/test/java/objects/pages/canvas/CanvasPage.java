package objects.pages.canvas;

import objects.base.PageBase;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static common.WebBrowser.webBrowser;
import static objects.pages.canvas.CanvasLocators.*;

public class CanvasPage extends PageBase {


    public CanvasPage clickBeginButton() {
        SearchContext drawingAppSR = getShadowRoot(webBrowser(), find(DRAWING_APP_ID));
        WebElement welcomeDialog = drawingAppSR.findElement(WELCOME_DIALOG_TAG);
        SearchContext welcomeDialogSR = getShadowRoot(webBrowser(), welcomeDialog);
        WebElement getStartedButton = welcomeDialogSR.findElement(GET_STARTED_BUTTON);
        getStartedButton.click();
        return this;
    }

    public boolean isCanvasReadyToDraw() {
        new WebDriverWait(webBrowser(), Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(DRAWING_APP_ID));
        SearchContext drawingAppSR = getShadowRoot(webBrowser(), find(DRAWING_APP_ID));
        WebElement drawingCanvas = drawingAppSR.findElement(DRAWING_CANVAS_ID);
        String attributeHidden = drawingCanvas.getAttribute("hidden");

        return attributeHidden != "true";
    }

    public CanvasPage drawSquare() {
        new WebDriverWait(webBrowser(), Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(DRAWING_APP_ID));
        SearchContext drawingAppSR = getShadowRoot(webBrowser(), find(DRAWING_APP_ID));
        WebElement drawingCanvas = drawingAppSR.findElement(DRAWING_CANVAS_ID);
        SearchContext drawingCanvasSR = getShadowRoot(webBrowser(), drawingCanvas);
        WebElement canvas = drawingCanvasSR.findElement(CANVAS_ID);

//        System.out.println(canvas.getAttribute("namespaceURI"));

        new WebDriverWait(webBrowser(), Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(canvas));

        Actions draw = new Actions(webBrowser());

        draw.moveToElement(canvas)
            .clickAndHold()
            .moveByOffset(0, 100)
            .moveByOffset(100, 0)
            .moveByOffset(0, -100)
            .moveByOffset(-100, 0)
            .release()
            .perform();
        return this;
    }
}
