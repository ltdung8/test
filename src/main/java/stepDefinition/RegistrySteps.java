package stepDefinition;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pageObjects.registrypage;
import utils.libs.TestBase;

public class RegistrySteps extends TestBase {

    registrypage locators_registry = new registrypage(driver);

    public String expected = "";
    public String actual = "";
    public RegistrySteps() {
    }

    @Given("^User opens the Open an account Private investor screen on the PC browser$")
    public void userOpensTheOpenAnAccountPrivateInvestorScreenOnThePCBrowser() /*throws Throwable*/ {
        String url = "https://dev.iip.ecoligo.com/registration";
        driver.get(url);
        actual = locators_registry.page_title().getText().toString();
        expected = "Open an account";
//        Thread.sleep(1000);
        Assert.assertEquals(expected, actual);
//        throw new PendingException();
    }




    @When("User goes to the Open an account Private investor screen")
    public void userGoesToTheOpenAnAccountPrivateInvestorScreen() {
        locators_registry.btn_privateInvestorAtSignUpPage().click();
    }




    @And("User doesn't enter data at the required fields")
    public void DoesNotEnterDataRequiredField() {

    }
    @And("Check at the checkbox of general terms agreement")
    public void checkBoxGeneralTermsAgreementAtSignUpPage() throws Throwable {
        locators_registry.checkBoxGeneralTermsAgreementAtSignUpPage().click();
    }
    @And("^Clicks Create account button$")
    public void clicksCreateAccountButton() {
        locators_registry.btn_createAccountAtSignUpPage().click();
    }
    @And("^User enter data at the required fields as \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void userEnterDataAtTheRequiredFieldsAs(String arg0, String arg1, String arg2, String arg3, String arg4) {
        locators_registry.firstNameFieldAtSignUpPage().sendKeys(arg0);
        locators_registry.lastNameFieldAtSignUpPage().sendKeys(arg1);
        locators_registry.emailFieldAtSignUpPage().sendKeys(arg2);
        locators_registry.passWordFieldAtSignUpPage().sendKeys(arg3);
        locators_registry.repeatPassWordFieldAtSignUpPage().sendKeys(arg4);
    }
    @And("Un-check at the checkbox of general terms agreement")
    public void uncheckAtTheCheckboxOfGeneralTerms() {
    }
    @And("Enters wrong format email as \"([^\"]*)\"$")
    public void enterWrongFormatEmail(String arg0) {
        locators_registry.emailFieldAtSignUpPage().sendKeys(arg0);
    }
    @And("^And Enters First name  \"([^\"]*)\"$")
    public void andEntersFirstName(String arg0)  {
        locators_registry.firstNameFieldAtSignUpPage().sendKeys(arg0);
    }
    @And("^Enters Last name as \"([^\"]*)\"$")
    public void entersLastNameAs(String arg0)  {
        locators_registry.lastNameFieldAtSignUpPage().sendKeys(arg0);
    }
    @And("^Enters E-mail address as \"([^\"]*)\"$")
    public void entersEMailAddressAs(String arg0) {
        locators_registry.emailFieldAtSignUpPage().sendKeys(arg0);
    }
    @And("Enters password as \"([^\"]*)\"$")
    public void enterPassWord(String arg0) {
        locators_registry.passWordFieldAtSignUpPage().sendKeys(arg0);
    }
    @And("Enters repeat password as \"([^\"]*)\"$")
    public void entersRepeatPasswordAs(String arg0) {
        locators_registry.repeatPassWordFieldAtSignUpPage().sendKeys(arg0);
    }
    @And("Clicks link Already registered_Login")
    public void clicksTextAlreadyRegistered() {
        locators_registry.link_alreadyRegistry().click();
    }





    @Then("Display the message as \"This field is required\" at below of each required field")
    public void displayMessageRequiredField() {
        // Verify first name message
        actual = locators_registry.error_firstNameFieldAtSignUpPage().getText().toString();
        expected = "This field is required.";
        Assert.assertEquals(expected , actual);

        // Verify last name message
        actual = locators_registry.error_lastNameFieldAtSignUpPage().getText().toString();
        expected = "This field is required.";
        Assert.assertEquals(expected , actual);

        //Verify email message
        actual = locators_registry.error_emailFieldAtSignUpPage().getText().toString();
        expected = "This field is required.";
        Assert.assertEquals(expected , actual);

        //Verify password message
        actual = locators_registry.error_passWordFieldAtSignUpPage().getText().toString();
        expected = "This field is required.";
        Assert.assertEquals(expected , actual);

        // Verify repeat password message
        actual = locators_registry.error_repeatPasswordFieldAtSignUpPage().getText().toString();
        expected = "This field is required.";
        Assert.assertEquals(expected , actual);

    }
    @Then("Display the message as \"You must accept the terms and conditions and the data protection policy in order to continue.\"")
    public void displayAnErrorMessageForCheckboxOfGeneralTerms() {
        actual = locators_registry.error_generalTermAtSignUpPage().getText().toString();
        expected = "You must accept the terms and conditions and the data protection policy in order to continue.";
        Assert.assertEquals(expected, actual);
    }
    @Then("Display the message as \"Something does not look right. Please check the e-mail address and try again.\"")
    public void displayAnErrorMessageForFormatMail() {
        actual = locators_registry.error_emailInvalidAtSignUpPage().getText().toString();
        expected = "Something doesn’t look right. Please check the e-mail address and try again.";
        Assert.assertEquals(expected, actual);
    }
    @Then("^Display the message as Both passwords should match.$")
    public void displayTheMessageAsBothPasswordsShouldMatch() {
        actual = locators_registry.error_repeatPasswordInvalidAtSignUpPage().getText().toString();
        expected = "Both passwords should match.";
        Assert.assertEquals(expected, actual);
    }
    @Then("^Display the message as (\\d+) characters or more, at least one letter and one number.$")
    public void displayTheMessageAsCharactersOrMoreAtLeastOneLetterAndOneNumber(int arg0) {
        actual = locators_registry.error_passWordInvalidAtSignUpPage().getText().toString();
        expected = "8 characters or more, at least one letter and one number.";
        Assert.assertEquals(expected, actual);
    }
    @Then("^An verification email will be sent to user's email address and show a message as \"([^\"]*)\"$")
    public void anVerificationEmailWillBeSentToUserSEmailAddressAndShowAMessageAs(String arg0) {

        // Text success
        actual = locators_registry.text_successCreateAccount().getText().toString();
        expected = "Success!";
        Assert.assertEquals(expected, actual);
        // Text sent verify email
        actual = locators_registry.text_sentVerifyEmailAfterCreateAccount().getText().toString();
        expected = "We have sent you a verification e-mail.";
        Assert.assertEquals(expected, actual);
        // Text check email
        actual = locators_registry.text_checkEmailAfterCreateAccount().getText().toString();
        expected = "Please check your inbox.";
        Assert.assertEquals(expected, actual);
        // Text go to login page
        actual = locators_registry.text_gotoPageLoginAfterCreateAccount().getText().toString();
        expected = "You can close this window or go back to the website.";
        Assert.assertEquals(expected, actual);
    }
    @Then("The UI will be back to the Login screen")
    public void theUIWillBeBackToTheLoginScreen() {;
        actual = driver.getCurrentUrl().toString();
        expected = "https://dev.iip.ecoligo.com/login";
        Assert.assertEquals(expected , actual);
    }

}


