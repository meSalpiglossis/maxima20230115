package tests;

import org.testng.annotations.Test;
import tests.base.TabsTestBase;

import static org.testng.Assert.assertTrue;

public class TabsTest extends TabsTestBase {

    @Test
    public void openAndCloseNewTab() {
        page1.openNewWindowAndSwitchToIt();

        assertTrue(page2.properTitlePresented());

        page2.closeCurrentTabBackToInitTab();

        assertTrue(page1.properTitlePresented());
    }
}
