package objects.pages.frames;

import objects.base.PageBase;

import static objects.pages.frames.NestedFramesLocators.*;
import static common.WebBrowser.webBrowser;

public class NestedFramesPage extends PageBase {

    public NestedFramesPage switchToLeftFrame() {
        webBrowser()
            .switchTo().defaultContent()
            .switchTo().frame(FRAME_TOP)
            .switchTo().frame(FRAME_LEFT);
        return this;
    }

    public boolean isLeftFrameTextMatchExpected() {
        return isTextInBodyMatchExpexted(FRAME_LEFT_EXPECTED_TEXT);
    }

    public NestedFramesPage switchToMiddleFrame() {
        webBrowser()
            .switchTo().defaultContent()
            .switchTo().frame(FRAME_TOP)
            .switchTo().frame(FRAME_MIDDLE);
        return this;
    }

    public boolean isMiddleFrameTextMatchExpected() {
        return isTextInBodyMatchExpexted(FRAME_MIDDLE_EXPECTED_TEXT);
    }

    public NestedFramesPage switchToRightFrame() {
        webBrowser()
            .switchTo().defaultContent()
            .switchTo().frame(FRAME_TOP)
            .switchTo().frame(FRAME_RIGHT);
        return this;
    }

    public boolean isRightFrameTextMatchExpected() {
        return isTextInBodyMatchExpexted(FRAME_RIGHT_EXPECTED_TEXT);
    }

    public NestedFramesPage switchToBottomFrame() {
        webBrowser()
            .switchTo().defaultContent()
            .switchTo().frame(FRAME_BOTTOM);
        return this;
    }

    public boolean isBottomFrameTextMatchExpected() {
        return isTextInBodyMatchExpexted(FRAME_BOTTOM_EXPECTED_TEXT);
    }

    private boolean isTextInBodyMatchExpexted(String expectedText) {
        return find(BODY).getText().equals(expectedText);
    }
}
