package steps;

import driver.ArticlePage;
import driver.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class PokemonStepsDefine {

    private ArticlePage articlePage = new ArticlePage();
    private HomePage homePage = new HomePage();

    @Given("User open Pokemon home page")
    public void userOpenPokemonHomePage() {
        homePage.openHomePage();
    }

    @When("User input search {string} on home page")
    public void userInputSearchOnHomePage(String keyword) {
        homePage.inputSearch(keyword);
    }

    @And("User click button search on home page")
    public void userClickButtonSearchOnHomePage() {
        homePage.clickSearch();
    }

    @Then("User see article with title {string} on article page")
    public void userSeeArticleWithTitleOnArticlePage(String title) {
        String actual = articlePage.getTitle();
        Assert.assertEquals(title, actual);
    }

    @Then("User see article with number {string} on article page")
    public void userSeeArticleWithNumberOnArticlePage(String number) {
        String actual = articlePage.getNumber(number);
        Assert.assertEquals(number, actual);
    }
}
