package com.open_cart_pr.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

public class OCMainPage {

    public OCMainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(text(),'Your Store')]")
    WebElement logo;

    @FindBy(xpath = "//a[@title='My Account']")
    WebElement myAccountBtn;

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement registerBtn;

    public void validateLogo(String expectedMsg){
        Assert.assertEquals(expectedMsg, BrowserUtils.getText(logo));

    }

    public void clickOnMyAccountRegister(){
        myAccountBtn.click();
        registerBtn.click();
    }



}
