package com.aumin.pages;

import com.aumin.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ScrolDownPage {
    public ScrolDownPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath="//div[@class='flex flex-between flex-center grid-prt']")
    public WebElement aboutUs;
}
