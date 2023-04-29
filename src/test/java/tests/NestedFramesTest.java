package tests;

import org.testng.annotations.Test;

import tests.base.NestedFramesTestBase;

public class NestedFramesTest extends NestedFramesTestBase {

    @Test
    public void switchAllNestedFramesOneByOne() {
        nestedFramesPage.switchToLeftFrame();
        soft.assertTrue(nestedFramesPage.isLeftFrameTextMatchExpected(), "FAILED: Left frame text check");

        nestedFramesPage.switchToMiddleFrame();
        soft.assertTrue(nestedFramesPage.isMiddleFrameTextMatchExpected(), "FAILED: Middle frame text check");

        nestedFramesPage.switchToRightFrame();
        soft.assertTrue(nestedFramesPage.isRightFrameTextMatchExpected(), "FAILED: Right frame text check");

        nestedFramesPage.switchToBottomFrame();
        soft.assertTrue(nestedFramesPage.isBottomFrameTextMatchExpected(), "FAILED: Bottom frame text check");

        soft.assertAll();
    }
}
