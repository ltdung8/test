//package pageObjects;
//
dung test 
//import org.openqa.selenium.*;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.util.ArrayList;
//import java.util.List;
//
//public class test {
//    public static WebDriver driver;
//    public static WebElement paginationLast, inputSearch, btn_search, paginationPrev, paginationFirst, paginationNext, element;
//    public static void main(String[] args) throws InterruptedException, IOException {
//        // Bài tập 1
//        // Config
//        System.setProperty("webdriver.chrome.driver", "D:\\Automation Test\\BDD_Framework_Tai\\BDD_Framework_Tai\\BDD_Framework\\src\\main\\java\\config\\chromedriver.exe");
//        final ChromeDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        // Go to main page "Dịch vụ công"
//        driver.get("https://dichvucong.gov.vn/p/home/dvc-trang-chu.html");
//        inputSearch = driver.findElement(By.xpath("//*[@id=\"searchKeyWord\"]"));
//        // Enter data at search input
//        String text_search = "Công dân";
//        inputSearch.sendKeys(text_search);
//        // Go to page result
//        inputSearch.sendKeys(Keys.ENTER);
//        // Calculate total number result
//        paginationLast = driver.findElement((By.xpath("//ul[@id='paginationKQTT']//li[@class='last']")));
//        paginationLast.click();
//        List<WebElement> numberPage = driver.findElements(By.xpath("//ul[@id='paginationKQTT']//li[@jp-role='page']"));
//        int totalNumberPage = Integer.valueOf(numberPage.get(numberPage.size() - 1).getAttribute("jp-data"));
//        List<WebElement> elementsOfPageEnd = driver.findElements(By.xpath("//ul[@id='ulProcedures']//li"));
//        String numberResult = ((Integer.valueOf(numberPage.get(numberPage.size() - 1).getAttribute("jp-data")))-1)*10 + elementsOfPageEnd.size() + "";
//        System.out.println("Total number result: " + numberResult);
//
//        // Bài tập 2
//        paginationFirst = driver.findElement((By.xpath("//ul[@id='paginationKQTT']//li[@class='first']")));
//        paginationFirst.click();
//        int numberPageCurrent = 0;
//        while(numberPageCurrent<totalNumberPage) {
//            List<WebElement> elementsOfPageCurrent = driver.findElements(By.xpath("//ul[@id='ulProcedures']//li"));
//            for (int j = 0; j <elementsOfPageCurrent.size() ; j++) {
//                String x = elementsOfPageCurrent.get(j).getText().trim();
//                String baiViet = "Đăng ký tài khoản định danh điện tử mức độ 2 đối với công dân Việt Nam";
//                if(x.equals(baiViet)) {
//                    // Tìm số dòng và trang
//                    System.out.println("Bài viết nằm ở dòng số: " + (j+1) + " Trang số: " + (numberPageCurrent + 1));
//                    // Mở bài viết trong tab mới
//                    Actions actions = new Actions(driver);
//                    actions.keyDown(Keys.LEFT_CONTROL)
//                            .click(elementsOfPageCurrent.get(j))
//                            .keyUp(Keys.LEFT_CONTROL)
//                            .build()
//                            .perform();
//                    // Chuyển sang tab mới mở
//                    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//                    driver.switchTo().window(tabs.get(1));
//                    Thread.sleep(2000);
//                    // Chụp ảnh và lưu vào file
//                    File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//                    File g = new File("D:\\Automation Test\\BDD_Framework_Tai\\BDD_Framework_Tai\\BDD_Framework\\test_result\\Screenshot\\dichvucong.png");
//                    Files.copy(f.toPath() , g.toPath());
//                }
//            }
//            numberPageCurrent++;
//            paginationNext = driver.findElement((By.xpath("//ul[@id='paginationKQTT']//li[@jp-role='next']")));
//            paginationNext.click();
//        };
//        driver.close();
//    }
//}
