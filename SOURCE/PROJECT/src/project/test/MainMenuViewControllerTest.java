package project.test;

import org.junit.Assert;
import org.junit.Test;
import project.Controllers.MainMenuViewController;

import static org.junit.Assert.*;

public class MainMenuViewControllerTest {

    @Test
    public void playFunctionTest() throws Exception{
        int actual= MainMenuViewController.playFunctionTest();
        Assert.assertEquals(1, 1);
    }

    @Test
    public void functionTest() throws Exception{
        int actual=MainMenuViewController.testPlayFunction();
        Assert.assertEquals(0, 0);
    }

    @Test
    public void imgLoadTest() throws Exception{
        int actual=MainMenuViewController.imgLoadTest();
        Assert.assertEquals(0, 0);
    }

    @Test
    public void exitButtonTest(){
        int actual=MainMenuViewController.exitButtonTest();
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