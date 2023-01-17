package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;


import java.time.Duration;

public class StepDefinitions {

    private WebDriver driver;
    private WebDriverWait wait;
///////////////////////////////////
    private WebDriver driver_admin;
    private WebDriverWait wait_admin;



// ------------ TODO ------------------------------------
    // $$*TODO* explain what this step does$$
    @Given("an example scenario")
    public void anExampleScenario() {
        System.out.println("this step define a pre condition of the current state, that means its our starting point of the scenario");
}
    // $$*TODO* explain what this step does$$
    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
        System.out.println("this step defines an action to do");
    }
    // $$*TODO* explain what this step does$$
    @Then("the scenario passes")
    public void theScenarioPasses() {
        System.out.println("this step defines an outcome and uses like assertion to make sure the scenario completed the way we wanted");
    }



    // ------------------ User Action ------------------------------
    @Given("The user on the pres page")
    public void the_user_on_the_pres_page() {
        // Write code here that turns the phrase above into concrete actions
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("http://localhost/prestashop/en/login?back=my-account");
        driver.manage().window().maximize();
    }
    @And("The user enters Email as {string} and Password as {string}")
    public void i_enter_my_username_and_password(String email,String pass) {
        // Find the username and password fields and enter the login credentials
        driver.findElement(By.id("field-email")).sendKeys(email);
        driver.findElement(By.id("field-password")).sendKeys(pass);
    }
    @And("the user click sign in")
    public void theUserClickSignIn() {
        driver.findElement(By.id("submit-login")).click();
    }

    @And("the user click myStore")
    public void theUserClickMyStore() {
        driver.findElement(By.xpath("/html/body/main/header/div[2]/div/div[1]/div[1]/a/img")).click();
    }
    @And("the user click on the white shirt")
    public void theUserClickOnTheWhiteShirt() {
        driver.findElement(By.xpath("/html/body/main/section/div/div/section/section/section/div/div[1]/article/div/div[1]/a/img")).click();
    }
    @And("the user click increase quantity by one")
    public void theUserClickIncreaseQuantityByOne() {
        driver.findElement(By.xpath("/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[1]/div/span[3]/button[1]/i")).click();
    }

    @And("the user click add to cart")
    public void theUserClickAddToCart() {
        driver.findElement(By.xpath("/html/body/main/section/div/div/section/div[1]/div[2]/div[2]/div[2]/form/div[2]/div/div[2]/button")).click();
    }
    @Then("a message showing product successfully added to cart appeared")
    public void aMessageShowingProductSuccessfullyAddedToCartAppeared() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div/div[1]/h4")));
    }
// ---------------ADMIN ACTIONS ------------------------------
    @Given("The admin on the presta page")
    public void theAdminOnThePrestaPage() {
        WebDriverManager.chromedriver().setup();
        driver_admin = new ChromeDriver();
        wait_admin = new WebDriverWait(driver_admin,Duration.ofSeconds(10));
        driver_admin.get("http://localhost/prestashop/admin365vadiyd/index.php?controller=AdminLogin&token=2f965c7cf586b7ef0c919f1c25709aa0");
        driver_admin.manage().window().maximize();
    }
    @And("The admin enters Email as {string} and Password as {string}")
    public void theAdminEntersEmailAsAndPasswordAs(String email,String pass) {
        driver_admin.findElement(By.id("email")).sendKeys(email);
        driver_admin.findElement(By.id("passwd")).sendKeys(pass);
    }
    @And("admin click log in")
    public void AdminClickLogIn() {
        driver_admin.findElement(By.id("submit_login")).click();
    }
    @When("admin navigate to catalog")
    public void adminNavigateToCatalog() {
        wait_admin.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"subtab-AdminCatalog\"]/a"))).click();
    }
    @And("admin click on products")
    public void AdminClickOnProducts() {
        wait_admin.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"subtab-AdminProducts\"]"))).click();
    }
    @And("admin changes quantity as {string}")
    public void adminChangesQuantityAs(String q) {
        driver_admin.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/form/div[3]/div[2]/div[2]/div/div/div/div/div/div[4]/div[1]/div[3]/table/tbody/tr[1]/td[6]/div/input\n")).sendKeys(q);
    }
    @And("admin click on white colored shirt quantity field")
    public void adminClickOnWhiteColoredShirtQuantityField() {
        wait_admin.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div/div[2]/div/div[2]/div/form/div[2]/div/div/table/tbody/tr[18]/td[9]/a\n"))).click();
    }

    @And("admin clean quantity field of shirt size-S")
    public void adminCleanQuantityFieldOfShirtSizeS() {
        wait_admin.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[1]/div/div[2]/div/form/div[3]/div[2]/div[2]/div/div/div/div/div/div[4]/div[1]/div[3]/table/tbody/tr[1]/td[6]/div/input\n"))).clear();
    }
    @And("admin save the new state")
    public void adminSaveTheNewState() {
        wait_admin.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form\"]/div[4]/div[2]/div[2]/button[1]"))).click();
    }
    @Then("Settings update message appear")
    public void settingsUpdateMessageAppear() {
        wait_admin.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[9]/div/div[3]")));
    }
}
