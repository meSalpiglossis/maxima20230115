package tests;

import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import tests.base.IFrameTestBase;

public class IFrameTest extends IFrameTestBase {

    @Test
    public void sendKeysToEditBoxV1() {
        iFramePage
            .sendKeysStandardMethod();

        assertTrue(iFramePage.textBoxContainsExpectedText());
    }

    @Test
    public void sendKeysToEditBoxV2() {
        iFramePage
            .sendKeysActionsMethod();

        assertTrue(iFramePage.textBoxContainsExpectedText());
    }

    @Test
    public void sendKeysToEditBoxV3() {
        iFramePage
            .sendKeysJSMethod();

        assertTrue(iFramePage.textBoxContainsExpectedText());
    }
}
