package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.Webdriverinstance;

public class HomePage {

    public void openHomePage(){
        Webdriverinstance.driver.get("https://bulbapedia.bulbagarden.net/wiki/Main_Page");
    }
    public void inputSearch(String keyword){
        WebElement inputSearch = Webdriverinstance.driver.findElement(By.id("searchInput"));
        inputSearch.sendKeys(keyword);
    }
    public void clickSearch(){
        WebElement inputSearch = Webdriverinstance.driver.findElement(By.id("searchInput"));
        inputSearch.sendKeys(Keys.ENTER);
    }
}
