package com.open_cart_pr.pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserUtils;

import java.util.List;

public class CustomerRegister {

    public CustomerRegister(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@name='firstname']")
    WebElement firstName;

    @FindBy(xpath = "//input[@name='lastname']")
    WebElement lastName;

    @FindBy(xpath = "//input[@name='email']")
    WebElement email;

    @FindBy(xpath = "//input[@name='telephone']")
    WebElement telephone;

    @FindBy(xpath = "//input[@name='password']")
    WebElement password;

    @FindBy(xpath = "//input[@name='confirm']")
    WebElement confirmPassword;

    @FindBy(xpath = "//div[@class='col-sm-10']//input[@name='newsletter']")
    List<WebElement> radioBtns;

    @FindBy(xpath = "//input[@name='agree']")
    WebElement agreeBtn;

    @FindBy(xpath = "//input[@type='submit']")
    WebElement submitBtn;

    @FindBy(xpath = "//h1[contains(text(),'Your')]")
    WebElement successMsg;

    public void provideFirstName(String firstName) throws InterruptedException {
        this.firstName.sendKeys(firstName);

    }

    public void provideLastName(String lastName){
        this.lastName.sendKeys(lastName);
    }

    public void provideEmail(String email){
        this.email.sendKeys(email);
    }

    public void provideTelephone(String telephone){
        this.telephone.sendKeys(telephone);
    }

    public void providePasswords(String password, String confirmPassword){
        this.password.sendKeys(password);
        this.confirmPassword.sendKeys(confirmPassword);
    }

    public void radioButton() throws InterruptedException {

        Thread.sleep(2000);
        for (int i = 0; i < radioBtns.size(); i++) {

            if (BrowserUtils.getText(radioBtns.get(i)).trim().equals("No")){
                Assert.assertTrue(radioBtns.get(i).isSelected());
            }

        }
    }

    public void agreeButtonAndSubmitBtn(){
        if (!agreeBtn.isSelected()){
            agreeBtn.click();
            submitBtn.click();
        }


    }

    public void successMessage(String successMsg){
        Assert.assertEquals(successMsg, BrowserUtils.getText(this.successMsg));
    }
}
