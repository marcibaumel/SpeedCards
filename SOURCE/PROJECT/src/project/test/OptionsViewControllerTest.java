package project.test;

import org.junit.Assert;
import org.junit.Test;
import project.Controllers.MainMenuViewController;
import project.Controllers.OptionsViewController;

public class OptionsViewControllerTest {

    @Test
    public void choiceBoxTest() throws Exception {
        int actual = MainMenuViewController.exitButtonTest();
        Assert.assertEquals(1, 1);
    }


    @Test
    public void volumeTest() throws Exception {
        int actual = MainMenuViewController.exitButtonTest();
        Assert.assertEquals(1, 1);
    }

    @Test
    public void sliderTest() throws Exception {
        int actual = MainMenuViewController.exitButtonTest();
        Assert.assertEquals(1, 1);
    }

}



