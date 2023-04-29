package tests.base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import objects.pages.frames.IFramePage;

import static common.WebBrowser.closeWebBrowser;
import static common.WebBrowser.openLink;

public class IFrameTestBase extends AllTestsBase {

    protected IFramePage iFramePage = new IFramePage();

    @BeforeMethod
    protected void openLinkInWebBrowser() {
        openLink("https://the-internet.herokuapp.com/iframe");
    }


}
