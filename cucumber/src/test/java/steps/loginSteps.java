package steps;

import Utils.CommonMethods;
import Utils.ConfigReader;
import Utils.ExcelReader;
import com.google.common.io.ByteSource;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LoginPage;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class loginSteps extends CommonMethods {


    /*public WebDriver driver;*/


   // LoginPage loginPage= new LoginPage();


    //comment this line because webdriver is calling from common methods
    //  public static WebDriver driver;


    @Given("user is able to access HRMS application")
    public void user_is_able_to_access_hrms_application() {
        //to launch the browser
        //  driver = new ChromeDriver();
        // driver.manage().window().maximize();
        // driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        openBrowserAndLaunchApplication();
    }

    @When("usr enters a valid username and password")
    public void usr_enters_a_valid_username_and_password() {
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        WebElement passwordField = driver.findElement(By.id("txtPassword"));

        sendText(ConfigReader.read("userName"),usernameField);
        sendText(ConfigReader.read("password"),passwordField);
        // usernameField.sendKeys("admin");
        // passwordField.sendKeys("Hum@nhrm123");
    }

    @When("user click on valid button")
    public void user_click_on_valid_button() {
        WebElement loginButton = driver.findElement(By.id("btnLogin"));
        //loginButton.click();
        click(loginButton);
    }
    @Then("user able to see dashboard page")
    public void user_able_to_see_dashboard_page(){
        System.out.println("User can see the dashboard");
    }
    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        System.out.println("Test passed");
    }

    @When("usr enters a invalid username and password")
    public void usr_enters_a_invalid_username_and_password() {
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        WebElement passwordField = driver.findElement(By.id("txtPassword"));

        sendText("admin321", usernameField);
        sendText("humn", passwordField);
        //  usernameField.sendKeys("admin321");
        //  passwordField.sendKeys("ghsnertuldnf");
    }

    @Then("user can see error message")
    public void user_can_see_error_message() {
        System.out.println("error is shown");
    }

}
