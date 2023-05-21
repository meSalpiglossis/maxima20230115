package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import tests.base.Html5CanvasTestBase;

public class Html5CanvasTest extends Html5CanvasTestBase {

    @Test
    public void openCanvasWithoutAuthTest() {
        canvasPage
            .clickBeginButton()
            .closePopUpWindow();

        assertTrue(canvasPage.isCanvasReadyToDraw());
    }

    @Test
    public void drawSquareOnCanvasTest() {
        canvasPage
            .clickBeginButton()
            .closePopUpWindow();

        assertTrue(canvasPage.isCanvasReadyToDraw());

        canvasPage
            .drawSquare()
            .takeScreenshot();
    }
}
