package com.aumin.test;

import com.aumin.pages.ScrolDownPage;
import com.aumin.pages.GetADemoPage;
import com.aumin.pages.LoginPage;
import com.aumin.utilities.ConfigurationReader;
import com.aumin.utilities.BrowserUtils;
import com.aumin.utilities.Driver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Test  {

    @BeforeMethod
    public void Test()throws InterruptedException{
        Driver.get().get(ConfigurationReader.get("url"));
        System.out.println( Driver.get().getTitle());
        Assert.assertTrue(Driver.get().getTitle().startsWith("Aumni"));
    }
    @org.testng.annotations.Test
    public void LoginTest () {
        LoginPage loginPage = new LoginPage();
        BrowserUtils.waitForClickablility(loginPage.login ,2);
        loginPage.login.click();
        BrowserUtils.waitForClickablility(loginPage.loginbutton ,2);
        loginPage.loginbutton.click();
        BrowserUtils.waitForClickablility(loginPage.email ,2);
        loginPage.email.click();
        loginPage.email.sendKeys("miki@yahoo.com");
        loginPage.password.click();
        loginPage.password.sendKeys("mikiyahoo");
        loginPage.submit.click();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(loginPage.Text1.getTagName(),"span");
    }
    @org.testng.annotations.Test
    public void adomoTest(){
        GetADemoPage aDemoPage =new GetADemoPage();
        aDemoPage.GetAdemoButton.click();
        BrowserUtils.waitFor(2);
        // enter value in firstname
        aDemoPage.firstname.click();
        aDemoPage.firstname.sendKeys("John");
        aDemoPage.lastname.click();
        aDemoPage.lastname.sendKeys("Smith");
        aDemoPage.emailname.click();
        aDemoPage.emailname.sendKeys("Johnsmith@yahoo.com");
        aDemoPage.company.click();
        aDemoPage.company.sendKeys("JohnCompany");
        // click sign up
        aDemoPage.submit1.click();
    }

    @org.testng.annotations.Test
    public void scrolDownTest () {
        com.aumin.pages.ScrolDownPage AU = new com.aumin.pages.ScrolDownPage();
        BrowserUtils.clickWithJS(AU.aboutUs);
    }


    @AfterMethod
    public void close(){
        Driver.closeDriver();
    }

}





