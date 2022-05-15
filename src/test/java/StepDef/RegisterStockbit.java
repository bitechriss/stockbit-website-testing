package StepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RegisterStockbit {
    WebDriver driver;
    @Given("User open Browser")
    public void userOpenBrowser() {
        final String dir = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", dir + "/driver/chromedriver.exe");
        System.out.println("current dir = " + dir);
        driver = new ChromeDriver();
    }

    /*@And("User on Stockbit Website")
    public void userOnStockbitWebsite() {

        driver.findElement(By.className("register-lnd")).click();

    }*/

    @And("User on Register page")
    public void userIsOnRegisterPage() {
        driver.navigate().to("https://stockbit.com/#/register");
        driver.findElement(By.linkText("Register with Email")).click();
    }

    @When("User enters Name")
    public void userEntersName () throws InterruptedException {
        driver.findElement(By.id("input-1")).sendKeys("Tabita Krisma");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement Element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("icon-toolbar_check")));
        String str = "Field Nama Sudah sesuai";
        System.out.println(str);
        Thread.sleep(1000);
    }

    @And("User enters Email")
    public void userEntersEmail() throws InterruptedException {
        driver.findElement(By.id("input-2")).sendKeys("tebkris14@gmail.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement Element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("icon-toolbar_check")));
        String str = "Field Email Sudah sesuai";
        System.out.println(str);
        Thread.sleep(2000);
    }

    @And("User enters username")
    public void userEntersUsername() throws InterruptedException {
        driver.findElement(By.id("input-3")).sendKeys("Tebekris25");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement Element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("icon-toolbar_check")));
        String str = "Field Username Sudah sesuai";
        System.out.println(str);
        Thread.sleep(2000);
    }

    @And("User enters passwordd")
    public void userEntersPasswordd() throws InterruptedException {
        driver.findElement(By.id("input-4")).sendKeys("Tebkris25");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement Element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("icon-toolbar_check")));
        String str = "Field Password Sudah sesuai";
        System.out.println(str);
        Thread.sleep(2000);
    }


    @And("User enters confrim password")
    public void userEntersConfrimPassword() throws InterruptedException {
        driver.findElement(By.id("input-5")).sendKeys("Tebkris25");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        WebElement Element = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.className("icon-toolbar_check")));
        String str = "Field Confirm Password Sudah sesuai";
        System.out.println(str);
        Thread.sleep(2000);
    }

    @And("User Click Register")
    public void userClickRegister() throws InterruptedException {
        driver.findElement(By.className("loginlogin")).click();

        Thread.sleep(2000);
    }

    @Then("User Navigated to Verification message")
    public void userNavigatedToVerificationMessage() throws InterruptedException {
        driver.getPageSource().contains("SMS Verifications");

        Thread.sleep(2000);
        driver.close();
        driver.quit();
    }
}
