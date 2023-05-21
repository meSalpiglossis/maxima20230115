package objects.pages.canvas;

import org.openqa.selenium.By;

public class CanvasLocators {
    public static final By GET_STARTED_BUTTON = By.cssSelector("#get-started");
    public static final By DRAWING_APP_ID = By.id("drawing-app");
    public static final By DRAWING_CANVAS_ID = By.cssSelector("#drawing-canvas");
    public static final By CANVAS_ID = By.cssSelector("canvas");
    public static final By WELCOME_DIALOG_TAG = By.cssSelector("welcome-dialog[test-state='open']");
}
