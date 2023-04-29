package objects.pages.tabs;

import objects.base.PageBase;

import static objects.pages.tabs.Page2Locators.*;
import static common.WebBrowser.webBrowser;

public class Page2 extends PageBase {

    public boolean properTitlePresented() {
        return webBrowser().getTitle().equals(EXPECTED_TITLE);
    }

    public void closeCurrentTabBackToInitTab() {
        webBrowser().close();
        webBrowser().switchTo().window(initialTab);
    }
}
