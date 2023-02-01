package StepDefinations;

import SeleniumCucumberCode.AT02_CreateAnAccount;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class SD05_CreateAnAccount {
    @Given("user navigates to Create and account screen")
    public void user_navigates_to_create_and_account_screen() throws IOException {
        AT02_CreateAnAccount.NavToCreateAcc();
    }
    @Then("enter data {string},{string},{string}")
    public void enter_data(String FirstName, String LastName, String EmailAddress) {
        AT02_CreateAnAccount.EnterAccDetails(FirstName,LastName,EmailAddress);
    }
}
