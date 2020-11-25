package project.test;

import org.junit.Assert;
import org.junit.Test;
import project.Controllers.MainMenuViewController;

import static org.junit.Assert.*;

public class OptionsViewControllerTest {

    @Test
    public void choiceBoxTest() throws Exception{
        int actual= MainMenuViewController.testPlayFunction();
        Assert.assertEquals(0, 0);
    }

    @Test
    public void sliderTest() throws Exception{
        int actual= MainMenuViewController.testPlayFunction();
        Assert.assertEquals(0, 0);
    }

    @Test
    public void valueOfVolumeTest() throws Exception{
        int actual= MainMenuViewController.testPlayFunction();
        Assert.assertEquals(0, 0);
    }


}