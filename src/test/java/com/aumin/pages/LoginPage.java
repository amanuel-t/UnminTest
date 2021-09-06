package com.aumin.pages;

import com.aumin.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css="a[class='navlink login']")
    public WebElement login;

    @FindBy(css="*[class='login-page-dialog-button']")
    public WebElement loginbutton;

    @FindBy(id="1-email")
    public WebElement email;

    @FindBy(xpath="//input[@name='password']")
    public WebElement password;

    @FindBy(xpath = "//button[@class='auth0-lock-submit']")
    public WebElement submit;

    @FindBy(xpath = "//span[@class='animated fadeInUp']")
    public WebElement Text1;

//    public void login(String userNameStr, String passwordStr) {
//        email.sendKeys(userNameStr);
//        password.sendKeys(passwordStr);
//        submit.click();
//        Text1.getText();
//    }
}
