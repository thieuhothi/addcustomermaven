package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static tests.pageProvider.getAddCustomerPage;

public class addCustomerTest extends pageProvider{

    @When("^I type first name as (.*), last name as (.*), post code as (.*)$")
    public void inputUserInformation(String firstname, String lastname, String postcode) throws InterruptedException {
        Thread.sleep(3000);
        getAddCustomerPage().setInformation(firstname, lastname, postcode);
    }


    @And("^I click submit$")
    public void clickSubmit() throws InterruptedException {
        getAddCustomerPage().clickSubmit();
    }

}
