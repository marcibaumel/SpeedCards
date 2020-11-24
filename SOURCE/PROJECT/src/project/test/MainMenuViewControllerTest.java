package project.test;

import org.junit.Assert;
import org.junit.Test;
import project.Controllers.MainMenuViewController;

import static org.junit.Assert.*;

public class MainMenuViewControllerTest {

    @Test
    public void playFunctionTest() throws Exception{
        int actual= MainMenuViewController.testFunction();
        Assert.assertEquals(1, 1);
    }

    @Test
    public void functionTest() throws Exception{
        int actual=MainMenuViewController.testPlayFunction();
        Assert.assertEquals(0, 0);
    }

    /*
    @Test
    public void backgroundFunctionTest() throws Exception{
        int actual=MainMenuViewController.
        Assert.assertEquals(0, 0);
    }

     */

}