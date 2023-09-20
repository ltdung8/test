package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.loginpage;
import utils.libs.TestBase;

public class LoginSteps extends TestBase{

    loginpage locators_login = new loginpage(driver);

    public String expected = "";
    public String actual = "";
    public LoginSteps(){

    }

    @Given("Go to the Login screen")
    public void goToLoginPage() throws Throwable{
        String url = "https://dev.iip.ecoligo.com/login";
        driver.get(url);
        actual = locators_login.page_title().getText().toString();
        expected = "Login";
        Thread.sleep(1000);
        Assert.assertEquals(expected, actual);

    }


    @When("User enters invalid email as \"([^\"]*)\"$")
    public void userEntersInvalidEmailAs(String arg0) throws Throwable {
        locators_login.txt_email().sendKeys(arg0);
    }
    @When("User enters invalid password as \"([^\"]*)\"$")
    public void userEntersInvalidPasswordAs(String arg0) throws Throwable {
        locators_login.txt_password().sendKeys(arg0);
    }
    @When("Does not enter email")
    public void doesNotEnterEmail() {
    }
    @When("Click text \"Forgot your password\"")
    public void clickLinkPassword() throws Throwable {
        locators_login.link_password().click();
        Thread.sleep(1000);
    }
    @When("Click text \"Didn't receive a verification email\"")
    public void clickLinkVerifyEmail() throws Throwable {
        locators_login.link_requestEmail().click();
        Thread.sleep(1000);
    }
    @When("Click text \"Don't have an account yet\"")
    public void clickLinkAccount() throws Throwable {
        locators_login.link_register().click();
        Thread.sleep(1000);
    }



    @And("Does not enter password")
    public void doesNotEnterPassword() {
    }

    @And("Click Login button")
    public void clickLoginButton() throws Throwable {
        locators_login.btn_login().click();
        Thread.sleep(1000);
    }
    @And("Click back button")
    public void clickBackButton() throws Throwable {
        locators_login.btn_back().click();
        Thread.sleep(1000);
    }





    @Then("Display an error message for invalid email")
    public void displayAnErrorMessageForInvalidEmail() {
        actual = locators_login.error_emailfield().getText().toString();
        expected = "Something doesn’t look right. Please check the e-mail address and try again.";
        Assert.assertEquals(expected , actual);
    }
    @Then("Display an error message for required fields")
    public void displayAnErrorMessageForRequiredFields() {
        //Verify email message
        actual = locators_login.error_emailfield().getText().toString();
        expected = "This field is required.";
        Assert.assertEquals(expected , actual);

        //Verify password message
        actual = locators_login.error_passwordfield().getText().toString();
        expected = "This field is required.";
        Assert.assertEquals(expected , actual);
    }
    @Then("Will go to forgot password page")
    public void willGoToForgotPasswordPage() throws Throwable{
        actual = driver.getCurrentUrl().toString();
        expected = "https://dev.iip.ecoligo.com/password-reset";
        Assert.assertEquals(expected , actual);
    }
    @Then("Will go to verification email page")
    public void willGoToVerifyEmailPage() throws Throwable{
        actual = driver.getCurrentUrl().toString();
        expected = "https://dev.iip.ecoligo.com/resend-verification";
        Assert.assertEquals(expected , actual);
    }
    @Then("Will go to signup page")
    public void willGoToSignUpPage() throws Throwable{
        actual = driver.getCurrentUrl().toString();
        expected = "https://dev.iip.ecoligo.com/registration";
        Assert.assertEquals(expected , actual);
    }
    @Then("Will go to login page")
    public void willGoToLoginPage() throws Throwable{
        actual = driver.getCurrentUrl().toString();
        expected = "https://dev.iip.ecoligo.com/login";
        Assert.assertEquals(expected , actual);
    }



}

