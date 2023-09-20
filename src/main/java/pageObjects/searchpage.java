package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class searchpage {
    public static WebElement element;
    public static WebDriver driver;
    public static List list;

    public searchpage (WebDriver driver) {this.driver = driver;}

    public static WebElement inputSearch() {
        element = driver.findElement(By.xpath("//*[@id=\"searchKeyWord\"]"));
        return element;
    }

    public static WebElement btn_search() {
        element = driver.findElement(By.xpath("/html/body/div[5]/div/div/div[1]/div/button"));
        return  element;
    }


    public static WebElement test() {
        element = driver.findElement(By.xpath("//*[@id=\"ulProcedures\"]/li[1]/a"));
        return  element;
    }

    public static WebElement btn_lastbutton() {
        element = driver.findElement(By.xpath("//*[@id=\"paginationKQTT\"]/li[9]"));
        return  element;
    }

    public static WebElement btn_page_num(int i) {
        element = driver.findElement(By.xpath("//ul[@id='paginationKQTT']/li[@jp-data='"+i+"']")); //biến i đã được khai báo bann đầu
        return  element;
    }

}
