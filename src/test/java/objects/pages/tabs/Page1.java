package objects.pages.tabs;

import objects.base.PageBase;

import static objects.pages.tabs.Page1Locators.*;
import static common.WebBrowser.webBrowser;

public class Page1 extends PageBase {

    String newTab;

    public void openNewWindowAndSwitchToIt() {
        click(NEW_WINDOW_LINK);
        newTab = webBrowser().getWindowHandles().toArray()[1].toString();
        webBrowser().switchTo().window(newTab);
    }

    public boolean properTitlePresented() {
        return webBrowser().getTitle().equals(EXPECTED_TITLE);
    }
}
