package objects.pages.frames;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import objects.base.PageBase;

import static common.WebBrowser.webBrowser;
import static objects.pages.frames.IFrameLocators.*;

public class IFramePage extends PageBase {

    public void sendKeysStandardMethod() {
        webBrowser()
            .switchTo().defaultContent()
            .switchTo().frame(TINY_MCE_FRAME);

        WebElement inputTextArea = webBrowser().findElement(INPUT_FIELD);

        inputTextArea.sendKeys(Keys.CONTROL + "a");
        inputTextArea.sendKeys(EXPECTED_TEXT);

        webBrowser().switchTo().defaultContent();
    }


    public void sendKeysActionsMethod() {
        webBrowser()
            .switchTo().defaultContent()
            .switchTo().frame(TINY_MCE_FRAME);

        WebElement inputTextArea = webBrowser().findElement(INPUT_FIELD);

        Actions typeSomeText = new Actions(webBrowser());

        typeSomeText
            .click(inputTextArea)
            .keyDown(Keys.CONTROL)
            .sendKeys("a")
            .keyUp(Keys.CONTROL)
            .sendKeys(EXPECTED_TEXT)
            .perform();

        webBrowser().switchTo().defaultContent();
    }

    public boolean textBoxContainsExpectedText() {
        webBrowser().switchTo().defaultContent();
        webBrowser().switchTo().frame(TINY_MCE_FRAME);

        return webBrowser().findElement(INPUT_FIELD)
            .getAttribute(ATTRIBUTE_INNER_TEXT).equals(EXPECTED_TEXT);
    }

    public void sendKeysJSMethod() {
        webBrowser()
            .switchTo().defaultContent()
            .switchTo().frame(TINY_MCE_FRAME);

        WebElement inputTextArea = webBrowser().findElement(INPUT_FIELD);

        JavascriptExecutor jse = (JavascriptExecutor) webBrowser();
        jse.executeScript("arguments[0].innerHTML = arguments[1]", inputTextArea, EXPECTED_TEXT);

        webBrowser().switchTo().defaultContent();
    }
}
