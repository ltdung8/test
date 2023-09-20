package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.passwordpage;
import utils.libs.TestBase;

public class PasswordSteps extends TestBase{

    passwordpage locators_password = new passwordpage(driver);

    public String expected = "";
    public String actual = "";
    public PasswordSteps(){

    }

    @Given("Go to the Password screen")
    public void goToPasswordPage() throws Throwable{
        String url = "https://dev.iip.ecoligo.com/password-reset";
        driver.get(url);
    }


    @When("Click text \"Did you already remember your password - Try logging in.\"")
    public void clickTextTryLoginAtPasswordPage() {
        locators_password.text_tryLoginAtPasswordPage().click();
    }


    @And("Click Send button at forgot password page")
    public void clickSendButtonForgotPasswordPage() throws Throwable {
        locators_password.btn_sendAtForgotPasswordPage().click();
        Thread.sleep(1000);
    }


    @Then("Display an error message for e-mail address fields")
    public void displayAnErrorMessageForEmailAddressFields() {
        actual = locators_password.error_emailFieldAtForgotPasswordPage().getText().toString();
        expected = "This field is required.";
        Assert.assertEquals(expected, actual);
    }





}

