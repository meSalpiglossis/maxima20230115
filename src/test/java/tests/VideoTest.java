package tests;

import org.testng.annotations.Test;

import tests.base.VideoTestBase;

import static org.testng.Assert.assertTrue;

public class VideoTest extends VideoTestBase {

    @Test
    public void videoSrcAndDurationTest() {

        videoPage.waitUntilVideoReady();

        assertTrue(videoPage.isCorrectSrcAndDuration());
    }
}
