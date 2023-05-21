package tests.base;

import objects.pages.canvas.CanvasPage;
import org.testng.annotations.BeforeMethod;

import static common.WebBrowser.openLink;

public class Html5CanvasTestBase extends AllTestsBase {

    protected CanvasPage canvasPage = new CanvasPage();

    @BeforeMethod
    protected void openLinkInWebBrowser() {
        openLink("https://canvas.apps.chrome/");
    }
}
