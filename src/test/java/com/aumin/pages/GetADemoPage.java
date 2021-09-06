package com.aumin.pages;

import com.aumin.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class GetADemoPage {
    public GetADemoPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "(//a[@class='btn btn-sm btn-nav w-button'] )[2]")
    public WebElement GetAdemoButton;

    @FindBy(xpath = "//input[@name='first-name'] ")
    public WebElement firstname;

    @FindBy(xpath = "//input[@name='last-name'] ")
    public WebElement lastname;

    @FindBy(xpath = "//input[@name='email'] ")
    public WebElement emailname;

    @FindBy(xpath = "//input[@name='company']")
    public WebElement company;//Please confirm you’re not a robot.

    @FindBy(xpath = "//input[@value='Submit'] ")
    public WebElement submit1;

    }




