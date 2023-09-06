package Steps;

import Pages.HomeScreen;
import Utilities.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ActivitiesSteps extends BaseTest {
    private HomeScreen homeScreen = new HomeScreen(driver);
    public ActivitiesSteps() {
    }

    @When("user click on sign in button")
    public void user_click_on_sign_in_button() {
        homeScreen.Click_Home_Sign_IN();
    }

    @And("User enter {string} and click on Continue button")
    public void User_enter_Email_and_click_on_Continue_button(String email) {
        homeScreen.click_Continue_after_enter_mail(email);
    }

    @And("User enter{string} and click on sign in button")
    public void User_enter_password_and_click_on_sign_button(String password) {
        homeScreen.click_SignIN_after_enter_password(password);
    }

    @Then("User Logged in")
    public void User_logged_in() {
        Assert.assertTrue(driver.findElement(homeScreen.getYourAccountScreen()).isDisplayed());
    }

    @When("User open “All” menu from the left side")
    public void user_open_all_menu_from_the_left_side() {
        homeScreen.click_All_Menu();
    }

    @And("User click on “video games” then choose “all video games”")
    public void user_click_on_video_games_then_choose_all_video_games() {
        homeScreen.click_All_Video_Games();
    }

    @And("User  add filter “free shipping”  click on from the filter menu on the left side & add the filter of condition “ new”")
    public void user_add_filter_free_shipping_click_on_from_the_filter_menu_on_the_left_side_add_the_filter_of_condition_new() {
        homeScreen.click_Free_shipping();
        homeScreen.click_Condition_New();
    }

    @And("User  open the sort menu in the right side then sort by price: high to low")
    public void user_open_the_sort_menu_in_the_right_side_then_sort_by_price_high_to_low() {
        homeScreen.click_High_To_Low();
    }

    @And("User add all products below that its cost below 15k EGP, if no product below 15k EGP move to next page")
    public void user_add_all_products_below_that_its_cost_below_15k_egp_if_no_product_below_15k_egp_move_to_next_page() {
        homeScreen.click_Go_button_after_max_Val();
    }

    @And("User make sure that all products is already added to carts")
    public void user_make_sure_that_all_products_is_already_added_to_carts() {
        homeScreen.click_first_Item();
        homeScreen.click_add_To_List();
    }

    @When("User add {string} {string} {string} {string} and choose cash as a payment method")
    public void user_add_Data_and_choose_cash_as_a_payment_method(String fullName ,String mobile ,String street ,String buildNum) {
        homeScreen.add_Address_Data(fullName , mobile , street , buildNum);
    }



}
