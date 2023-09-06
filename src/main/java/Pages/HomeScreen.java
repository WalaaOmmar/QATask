package Pages;

import lombok.Getter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;


@Getter
public class HomeScreen {
    private WebDriver driver;
    Actions actions;
    WebDriverWait wait;
    private final By home_Sign_in = By.id("nav-link-accountList-nav-line-1");
    private final By ap_email = By.id("ap_email");
    private final By continue_button = By.id("continue");
    private final By ap_password = By.id("ap_password");
    private final By signInSubmit = By.id("signInSubmit");
    private final By yourAccountScreen = By.cssSelector("a[href*='nav_youraccount_btn']");
    private final By all_Menu_button = By.id("nav-hamburger-menu");
    private final By all_Menu = By.id("hmenu-content");
    private final By arrow_See_More = By.xpath("//a[@class='hmenu-item hmenu-compressed-btn']");//("//*[text()='see all']/parent::a");
    private final By video_Games = By.xpath("//ul[@class='hmenu-compress-section']//li[11]//a[1]");
    private final By all_Video_Games = By.xpath("//*[@id=\"hmenu-content\"]/ul[16]/li[3]/a");
    private final By free_Shipping = By.xpath("//span[@class='a-size-base a-color-base'][normalize-space()='Free Shipping']");
    private final By condition_New = By.xpath("//*[@id=\"p_n_condition-type/28071525031\"]/span/a");
    private final By sort_Arrow = By.xpath("//span[normalize-space()='Bestselling']");
    private final By high_To_Low = By.id("s-result-sort-select_2");
    private final By high_Price = By.xpath("//*[@id='high-price']");
    private final By go_Button = By.xpath("//input[@class='a-button-input']");
    private final By first_Item = By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[1]/div/div[2]/div/span/a");
    private final By add_To_List = By.id("add-to-wishlist-button-submit");
    private final By view_List = By.xpath("//a[normalize-space()='View your list']");
    private final By see_All_buy_Option = By.xpath("//a[@class='a-button-text a-text-center']");
    private final By add_To_Cart = By.xpath("//span[@id='a-autoid-2-offer-1']//input[@name='submit.addToCart']");
    private final By close_Pop_Up = By.xpath("//i[@aria-label='aod-close']");
    private final By cart = By.xpath("//span[normalize-space()='Cart']");
    private final By proceed_To_Buy = By.xpath("//input[@name='proceedToRetailCheckout']");
    private final By change_address = By.id("addressChangeLinkId");
    private final By add_new_address = By.id("add-new-address-popover-link");
    private final By full_Name = By.id("address-ui-widgets-enterAddressFullName");
    private final By mobile = By.id("address-ui-widgets-enterAddressPhoneNumber");
    private final By street = By.id("address-ui-widgets-enterAddressLine1");
    private final By build_num = By.id("address-ui-widgets-enter-building-name-or-number");
    private final By city = By.id("address-ui-widgets-enterAddressCity");
    private final By city_name = By.xpath("//li[1]");

    private final By district = By.id("address-ui-widgets-enterAddressDistrictOrCounty");
    private final By district_name = By.xpath("//li[@class='autoOp']");

    private final By address_Type = By.xpath("//span[contains(text(),'Home (7am-9pm, all days)')]");
    private final By default_address = By.xpath("//input[@id='address-ui-widgets-use-as-my-default']");
    private final By add_address = By.xpath("//input[@aria-labelledby='address-ui-widgets-form-submit-button-announce']");


    public HomeScreen(WebDriver driver) {
        this.driver = driver;
        this.actions = new Actions(this.driver);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(8));
    }

    public void Click_Home_Sign_IN() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(home_Sign_in));
        driver.findElement(home_Sign_in).click();
    }

    public void click_Continue_after_enter_mail(String mail) {
        driver.findElement(ap_email).sendKeys(mail);
        driver.findElement(continue_button).click();
    }

    public void click_SignIN_after_enter_password(String password) {
        driver.findElement(ap_password).sendKeys(password);
        driver.findElement(signInSubmit).click();
    }

    public void click_All_Menu() {

        driver.findElement(all_Menu_button).click();
    }

    public void click_All_Video_Games() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(arrow_See_More));
        driver.findElement(arrow_See_More).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(video_Games));
        driver.findElement(video_Games).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(all_Video_Games));
        actions.moveToElement(driver.findElement(all_Video_Games)).click().build().perform();

    }

    public void click_Free_shipping() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(free_Shipping));
        driver.findElement(free_Shipping).click();


    }

    public void click_Condition_New() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(condition_New));
        WebElement newC = driver.findElement(condition_New);
        actions.moveToElement(newC).click().build().perform();
    }

    public void click_High_To_Low() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(sort_Arrow));
        driver.findElement(sort_Arrow).click();
        driver.findElement(high_To_Low).click();
    }

    public void click_Go_button_after_max_Val() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(high_Price));
        WebElement maxVal = driver.findElement(high_Price);
        actions.moveToElement(maxVal).perform();

        maxVal.sendKeys("15000");
        driver.findElement(go_Button).click();
    }

    public void click_first_Item() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(first_Item));
        driver.findElement(first_Item).click();
    }

    public void click_add_To_List() {
        driver.findElement(add_To_List).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(view_List));
        driver.findElement(view_List).click();
        driver.findElement(see_All_buy_Option).click();
        driver.findElement(add_To_Cart).click();
        driver.findElement(close_Pop_Up).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(cart));

        driver.findElement(cart).click();
        driver.findElement(proceed_To_Buy).click();
    }

    public void add_Address_Data(String fullName, String mobile, String street, String buildNum) {
        driver.findElement(change_address).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(add_new_address));
        driver.findElement(add_new_address).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(full_Name));
        driver.findElement(full_Name).sendKeys(fullName);
        driver.findElement(this.mobile).sendKeys(mobile);
        driver.findElement(this.street).sendKeys(street);
        driver.findElement(this.build_num).sendKeys(buildNum);
        driver.findElement(city).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(city));

        driver.findElement(city_name).click();


        driver.findElement(district).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(district));
        driver.findElement(district_name).click();


        driver.findElement(address_Type).click();
        driver.findElement(default_address).click();
        driver.findElement(add_address).click();
    }
}
