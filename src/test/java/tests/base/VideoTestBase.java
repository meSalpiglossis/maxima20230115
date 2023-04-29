package tests.base;

import objects.pages.video.VideoPage;
import org.testng.annotations.BeforeMethod;

import static common.WebBrowser.openLink;

public class VideoTestBase extends AllTestsBase {

    protected VideoPage videoPage = new VideoPage();

    @BeforeMethod
    protected void openLinkInWebBrowser() {
        openLink("https://www.youtube.com/watch?v=__ZIBcfm8h8");
    }
}
