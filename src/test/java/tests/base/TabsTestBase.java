package tests.base;

import objects.pages.tabs.Page1;
import objects.pages.tabs.Page2;

import org.testng.annotations.BeforeMethod;

import static common.WebBrowser.openLink;

public class TabsTestBase extends AllTestsBase{

    protected Page1 page1 = new Page1();
    protected Page2 page2 = new Page2();

    @BeforeMethod
    protected void openLinkInWebBrowser() {
        openLink("https://the-internet.herokuapp.com/windows");
    }
}
