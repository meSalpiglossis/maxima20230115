package tests.base;

import org.testng.annotations.BeforeMethod;

import objects.pages.frames.NestedFramesPage;

import static common.WebBrowser.openLink;

public class NestedFramesTestBase extends AllTestsBase{

    protected NestedFramesPage nestedFramesPage = new NestedFramesPage();

    @BeforeMethod
    protected void openLinkInWebBrowser() {
        openLink("https://the-internet.herokuapp.com/nested_frames");
    }
}
