package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class passwordpage {
    public static WebDriver driver;
    public static WebElement element;


    public passwordpage(WebDriver driver) {
        this.driver = driver;
    }


    public static WebElement btn_sendAtForgotPasswordPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/form/div[2]/button"));
        return element;
    }
    public static WebElement error_emailFieldAtForgotPasswordPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[2]/form/div[1]/span"));
        return element;
    }
    public static WebElement text_tryLoginAtPasswordPage() {
        element = driver.findElement(By.xpath("//*[@id=\"root\"]/div[2]/div[1]/div[3]/a"));
        return element;
    }

}