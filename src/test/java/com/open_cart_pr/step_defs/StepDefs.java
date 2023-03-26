package com.open_cart_pr.step_defs;

import com.open_cart_pr.pages.CustomerRegister;
import com.open_cart_pr.pages.OCMainPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.ConfigReader;
import utils.DriverHelper;

import java.sql.Driver;

public class StepDefs {

    WebDriver driver = DriverHelper.getDriver();

    OCMainPage mainPage = new OCMainPage(driver);

    CustomerRegister register = new CustomerRegister(driver);

    @When("User navigates to webpage user should be able to see the webpage logo {string}")
    public void user_navigates_to_webpage_user_should_be_able_to_see_the_webpage_logo(String logoMsg) {

        mainPage.validateLogo(logoMsg);

    }

    @Then("User clicks on my account and clicks on register")
    public void user_clicks_on_my_account_and_clicks_on_register() {
        mainPage.clickOnMyAccountRegister();
    }

    @Then("User creates an account by providing {string} as a firstName")
    public void user_creates_an_account_by_providing_as_a_first_name(String firstName) throws InterruptedException {
        register.provideFirstName(firstName);
    }

    @Then("User provides {string} as a lastName")
    public void user_provides_as_a_last_name(String lastName) {
        register.provideLastName(lastName);
    }

    @When("User provides {string} as an email")
    public void user_provides_as_an_email(String email) {
        register.provideEmail(email);
    }

    @Then("user provides {string} as a telephone number")
    public void user_provides_as_a_telephone_number(String phoneNumber) {
        register.provideTelephone(phoneNumber);
    }

    @Then("User provides password and confirms the password")
    public void user_provides_password_and_confirms_the_password() {
        register.providePasswords(ConfigReader.readProperty("pass1"), ConfigReader.readProperty("pass2"));
    }

    @Then("User choose to check no on Subscribe radio button")
    public void user_choose_to_check_no_on_subscribe_radio_button() throws InterruptedException {
        register.radioButton();
    }

    @Then("User check agree radio button and clicks Continue button")
    public void user_check_agree_radio_button_and_clicks_continue_button() throws InterruptedException {
        register.agreeButtonAndSubmitBtn();
    }

    @Then("User validates that account is created successfully message {string}")
    public void user_validates_that_account_is_created_successfully_message(String successMsg) {
        register.successMessage(successMsg);
    }


}
