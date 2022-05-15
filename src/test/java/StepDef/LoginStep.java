package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginStep {
    WebDriver driver;
    @Given("Browser is open")
    public void browserIsOpen() {
        final String dir = System.getProperty("user.dir");
        System.out.println("current dir = " + dir);
        System.setProperty("webdriver.chrome.driver", dir + "/driver/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @And("User is on login page")
    public void userIsOnLoginPage() {

        driver.navigate().to("https://stockbit.com/#/login");
    }

    @When("User enters username and password")
    public void userEntersUsernameAndPassword() {

        driver.findElement(By.id("password")).sendKeys("Tebkris25");
    }

    @And("user Click on button login")
    public void userClickOnButtonLogin() throws InterruptedException {
        driver.findElement(By.id("loginbutton")).click();

        Thread.sleep(2000);
    }

    @Then("User Navigated  to the home page")
    public void userNavigatedToTheHomePage() {
        //driver.findElement(By.id("homelink")).isDisplayed();
        //driver.findElement(By.xpath("//*[contains(text(),'Buat profil Stockbit kamu lebih berkarakter dengan memilih satu dari berbagai macam pilihan avatar!')]")).isDisplayed();
        driver.getPageSource().contains("Buat profil Stockbit kamu lebih berkarakter dengan memilih satu dari berbagai macam pilihan avatar!");
        driver.close();
        driver.quit();
    }
}
