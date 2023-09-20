package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {
    public static WebDriver driver;
    private static WebElement element;


    public loginpage(WebDriver driver) {
        this.driver = driver;
    }

    public static WebElement page_title() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/h5"));
        return element;
    }
    public static WebElement txt_email() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/div[2]/div[1]/div/fieldset/input"));
        return element;
    }
    public static WebElement txt_password() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/div[2]/div[2]/div/fieldset/input"));
        return element;
    }

    public static WebElement error_emailfield(){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/div[2]/div[1]/div/span"));
        return element;
    }
    public static WebElement error_passwordfield(){
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/div[2]/div[1]/div/span"));
        return element;
    }

    public static WebElement link_password() {
        element = driver.findElement(By.xpath("//a[@href=\"/password-reset\"]"));
        return element;
    }
    public static WebElement link_requestEmail() {
        element = driver.findElement(By.xpath("//a[@href=\"/resend-verification\"]"));
        return element;
    }
    public static WebElement link_register() {
        element = driver.findElement(By.xpath("//a[@href=\"/registration\"]"));
        return element;
    }

    public static WebElement btn_login() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div/div[2]/div[3]/button"));
        return element;
    }
    public static WebElement btn_back() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div/div/button"));
        return element;
    }


}