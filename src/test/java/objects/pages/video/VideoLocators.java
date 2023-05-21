package objects.pages.video;

import org.openqa.selenium.By;

public class VideoLocators {

    //DATA ONLY FOR https://www.youtube.com/watch?v=__ZIBcfm8h8

    public static final By VIDEO_PLAYER = By.cssSelector(".video-stream.html5-main-video");

    public static final By COMMENTS = By.cssSelector("#contenteditable-root.style-scope.yt-formatted-string");

    public static final String BDD_VIDEO_EXPECTED_SRC = "blob:https://www.youtube.com/e7267f72-d546-4b38-8bae-4c54cd645988";

    public static final double BDD_VIDEO_DURATION = 3035.5333333333333D;


}
