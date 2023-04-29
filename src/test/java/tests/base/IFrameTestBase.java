package tests.base;

import objects.pages.frames.IFramePage;
import org.testng.annotations.BeforeMethod;

import static common.WebBrowser.openLink;

public class IFrameTestBase {
    protected IFramePage iFramePage = new IFramePage();

    @BeforeMethod
    protected void openLinkInWebBrowser() {
        openLink("https://the-internet.herokuapp.com/iframe");
    }
}
