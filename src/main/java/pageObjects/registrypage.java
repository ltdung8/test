package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registrypage {
    public static WebDriver driver;

    private static WebElement element;

    public registrypage(WebDriver driver) { this.driver = driver;}

    public static WebElement page_title() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/span"));
        return element;
    }
    public static WebElement btn_createAccountAtSignUpPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[2]/form/button"));
        return element;
    }
    public static WebElement btn_privateInvestorAtSignUpPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[1]/button[1]"));
        return element;
    }
//    public static WebElement btn_companyAtSignUpPage() {
//        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[1]/button[2]"));
//        return element;
//    }


    public static WebElement error_firstNameFieldAtSignUpPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[2]/form/div[1]/div[1]/span"));
        return element;
    }

    public static WebElement error_lastNameFieldAtSignUpPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[2]/form/div[1]/div[2]/span"));
        return element;
    }

    public static WebElement error_emailFieldAtSignUpPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[2]/form/div[2]/div/span"));
        return element;
    }

    public static WebElement error_passWordFieldAtSignUpPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[2]/form/div[3]/span"));
        return element;
    }

    public static WebElement error_repeatPasswordFieldAtSignUpPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[2]/form/div[4]/span"));
        return element;
    }





    public static WebElement firstNameFieldAtSignUpPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[2]/form/div[1]/div[1]/fieldset/input"));
        return element;
    }
    public static WebElement lastNameFieldAtSignUpPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[2]/form/div[1]/div[2]/fieldset/input"));
        return element;
    }
    public static WebElement emailFieldAtSignUpPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[2]/form/div[2]/div/fieldset/input"));
        return element;
    }
    public static WebElement passWordFieldAtSignUpPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[2]/form/div[3]/fieldset/input"));
        return element;
    }
    public static WebElement repeatPassWordFieldAtSignUpPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[2]/form/div[4]/fieldset/input"));
        return element;
    }
    public static WebElement checkBoxGeneralTermsAgreementAtSignUpPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[2]/form/div[5]/div/div/span/input"));
        return element;
    }


    public static WebElement error_generalTermAtSignUpPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[2]/form/div[5]/span"));
        return element;
    }

    public static WebElement error_emailInvalidAtSignUpPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[2]/form/div[2]/div/span"));
        return element;
    }
    public static WebElement error_passWordInvalidAtSignUpPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[2]/form/div[3]/span"));
        return element;
    }

    public static WebElement error_repeatPasswordInvalidAtSignUpPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[2]/form/div[4]/span"));
        return element;
    }


    public static WebElement text_successCreateAccount() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/h5"));
        return element;
    }
    public static WebElement text_sentVerifyEmailAfterCreateAccount() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div[1]/p[1]"));
        return element;
    }
    public static WebElement text_checkEmailAfterCreateAccount() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div[1]/p[2]"));
        return element;
    }
    public static WebElement text_gotoPageLoginAfterCreateAccount() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div[2]/p"));
        return element;
    }


    public static WebElement link_alreadyRegistry() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div/div[2]/div[1]/div/div[2]/form/a"));
        return element;
    }

}
