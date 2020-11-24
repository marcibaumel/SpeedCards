package project.test;

import org.junit.Assert;
import org.junit.Test;
import project.Controllers.MainMenuViewController;


public class SoundManagerTest {

    @Test
    public void functionTest() throws Exception{
        int actual= MainMenuViewController.testPlayFunction();
        Assert.assertEquals(0, 0);
    }

}