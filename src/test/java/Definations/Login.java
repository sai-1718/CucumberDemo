package Definations;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login
{
    @Given("User should navigated to the login page")
    public void user_should_navigated_to_the_login_page() {

    }
    @When("User is entered the valid email")
    public void user_is_entered_the_valid_email() {
        System.out.println("hee");
    }
    @When("User entered valid password")
    public void user_entered_valid_password() {
        System.out.println("hee");
    }
    @When("User clicked on submit button")
    public void user_clicked_on_submit_button() {
        System.out.println("hee");
    }
    @Then("user should successfully login and see account")
    public void user_should_successfully_login_and_see_account() {
        System.out.println("hee");
    }
}
