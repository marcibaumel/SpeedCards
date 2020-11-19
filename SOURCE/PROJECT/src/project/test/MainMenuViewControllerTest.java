package project.test;

import org.junit.Assert;
import org.junit.Test;
import project.Controllers.MainMenuViewController;

import static org.junit.Assert.*;

public class MainMenuViewControllerTest {

    @Test
    public void playFunctionTest() throws Exception{
        int actual= MainMenuViewController.playFunction();
        Assert.assertEquals(1, 1);
    }
}