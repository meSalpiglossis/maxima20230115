package tests.base;

import org.testng.annotations.BeforeMethod;

import objects.pages.frames.NestedFramesPage;

import org.testng.asserts.SoftAssert;

import static common.WebBrowser.openLink;

public class NestedFramesTestBase extends AllTestsBase{

    protected NestedFramesPage nestedFramesPage = new NestedFramesPage();

    protected SoftAssert soft;

    @BeforeMethod
    protected void openLinkInWebBrowser() {
        openLink("https://the-internet.herokuapp.com/nested_frames");

        soft = new SoftAssert();
    }
}
