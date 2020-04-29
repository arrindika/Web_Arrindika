package driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Webdriverinstance;

public class ArticlePage {

    public String getTitle(){
        WebElement titleArticle = Webdriverinstance.driver.findElement(By.id("firstHeading"));
        String title = titleArticle.getText();
        return title;
    }

    public String getNumber(String keyword){
        WebElement numberArticle = Webdriverinstance.driver.findElement(By.xpath("//table[@class='roundy']//a[@title='"+keyword+"']/span"));
        String number = numberArticle.getText();
        return number;
    }

}
