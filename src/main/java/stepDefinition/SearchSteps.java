package stepDefinition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pageObjects.searchpage;
import utils.libs.TestBase;

import java.util.ArrayList;
import java.util.List;

public class SearchSteps extends TestBase {
        searchpage locators_search = new searchpage(driver);
        //Tao bien toan cuc href (href để truy cập link)
        String href = "";
        public SearchSteps() {
        }

        @Given("User opens 'Dịch vụ công' screen on the PC browser")
        public void userOpensDichVuCongScreen() throws Throwable  {
            String url = "https://dichvucong.gov.vn/p/home/dvc-trang-chu.html";
            driver.get(url);
            Thread.sleep(10000);
        }

        @When("^User enter data at input search as \"([^\"]*)\"$")
        public void userEnterDataAtInputSearchAs(String arg0)  {
                locators_search.inputSearch().sendKeys(arg0);
        }


        @And("^User press enter from keyboard$")
        public void userPressEnterFromKeyboard() throws InterruptedException{
                locators_search.inputSearch().sendKeys(Keys.ENTER);
                Thread.sleep(500);
        }
//        @And("^User press and hold ctrl after click$")
//        public void userPressAndHoldCtrlAfterClick() {
//                Actions actions = new Actions(driver);
//                actions.keyDown(Keys.LEFT_CONTROL)
//                        .click(locators_search.test())
//                        .keyUp(Keys.LEFT_CONTROL)
//                        .build()
//                        .perform();
//        }

//        @Then("^Check sum of record result and preview at console of terminal$")
//        public void checkSumOfRecordResultAndPreviewAtConsoleOfTerminal() throws Throwable {
//
//        }


        @And("^Show the total number of the results$")
        public void showTheTotalNumberOfTheResults() {
                //Đếm số trang bằng cách lấy giá trị jp-data của button "Last page" vì jp-data của button có giá trị = sô trang tổng cộng
                String string_attribute = locators_search.btn_lastbutton().getAttribute("jp-data");
                try{
                        //Count the number of pages
                        int page_count = Integer.parseInt(string_attribute);
                        //integer đưa về dạng số
                        //parseInt(string_attribute) trả về 1 chuỗi là con số

                        int page_temp = page_count - 1;
                        // số trang trước trang cuối

                        int total = page_temp * 10;
                        //tính tổng số bài viết của n-1 trang

                        //Open the last page
                        locators_search.btn_lastbutton().click();

                        //Tạo list chứa các đối tượng WebElement <li>
                        List<WebElement> row_per_page = driver.findElements(By.xpath("//ul[@id='ulProcedures']/li"));
                        total = total + row_per_page.size();
                        //đếm các bài viết ở trang cuối, đếm theo dòng, thẻ bài viết có chung thẻ li trong html
                        //chưa biết cách lấy xpath //ul[@id='ulProcedures']/li
                                //ul: thẻ ul (thẻ chứa list kết quả)

                        System.out.println("Total items: " + total);

                }catch (Exception e){
                        //Exception e: đọc lỗi
                        System.out.println(e);
                        //in ra lỗi
                }


        }

        @Then("^Open the target article's details as \"([^\"]*)\" in the new tab$")
        public void openTheTargetArticleSDetailsAsInTheNewTab(String arg0) throws Throwable {
                String string_attribute = locators_search.btn_lastbutton().getAttribute("jp-data");
                // xác định số trang
                int page_count = Integer.parseInt(string_attribute);
                //chuyển đổi số trang sang chữ số(khai báo biến int)

                //Tạo vòng lặp đếm số trang
                        for(int page=1; page<=page_count; page++){

                        locators_search.btn_page_num(page).click();
                        //click từng page num

                        List<WebElement> row_per_page = driver.findElements(By.xpath("//ul[@id='ulProcedures']/li"));
                        //Tạo list chứa các đối tượng WebElement <li>
                        Thread.sleep(1000);

                        //Tạo vòng lặp đếm số dòng mỗi trang
                                for(int row=0; row<row_per_page.size(); row++){
                                //row_per_page.size() đếm xem có bn row trong page
                                //row<row_per_page.size vì row đếm từ 0


                                String expected_article = arg0;
                                //lấy giá trị được truyền đã có ở dichvucong_hw.feature

                                String actual_article = row_per_page.get(row).getText();

                                //So sánh tên bài viết tại mỗi row với tên bài viết mong muốn
                                if(actual_article.equals(expected_article)){
                                        //Nếu so sánh đúng thì lấy giá trị href để mở ở tab mới
                                        href = driver.findElement(By.partialLinkText(expected_article)).getAttribute("href");
                                        System.out.println(href);
                                        break;
                                }
                        }
                }

                //Open new tab
                ((JavascriptExecutor)driver).executeScript("window.open()");
                ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
                //đếm có bn tab r lưu ở đây

                //Switch to the new tab
                driver.switchTo().window(tabs.get(1));

                //Paste the article's href to open
                driver.navigate().to(href);
                Thread.sleep(1000);
        }

        @And("^Show the total number of the results - opt2$")
        public void showTheTotalNumberOfTheResultsWay() throws InterruptedException{

        }
}
