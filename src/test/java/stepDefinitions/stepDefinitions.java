package stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class stepDefinitions {

    @Given("User is on NetBanking landing page")
    public void user_is_on_NetBanking_landing_page(){
        //Write code for the user to navigate to the landing page (URL)
        System.out.println("Navigate to login URL");
    }

    @When("User login to our application with {string} and password {string}")
    public void user_login_with_credentials(String username, String password) {
        //code to log in
        System.out.println("username: " + username + "\n" + "password: " + password);
    }

    @Then("Home page is populated")
    public void home_page_is_populated() {
        //home page validation
        System.out.println("Validated homepage");
    }

    @And("Display cards {string}")
    public void cards_are_displayed(String bool) {
        //validate the cards are displaying
        System.out.println("Cards Validated: " + bool);
    }

   @When("User signs up with the following details")
    public void users_sign_up_with_the_following_details(DataTable data) {
        List<List<String>> obj = data.asLists();
        System.out.println(obj.get(0).get(0));
        System.out.println(obj.get(0).get(1));
        System.out.println(obj.get(0).get(2));
        System.out.println(obj.get(0).get(3));
        System.out.println(obj.get(0).get(4));
   }

    @When("User logins into application with {string} and password {string}")
    public void user_login_into_application_with_user1_and_password_pass1(String username, String password) {
        System.out.println("Username: " + username + "\n" + "Password: " + password);
    }

}
