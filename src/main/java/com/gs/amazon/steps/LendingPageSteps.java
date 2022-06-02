package com.gs.amazon.steps;

import com.gs.amazon.actions.LandingPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LendingPageSteps {

    @Steps
    LandingPageActions landingPageActions;


    @Given("User open amazon landing page")
    public void user_open_amazon_landing_page() {
        System.out.println("LendingPageSteps.user_open_amazon_landing_page");
    }

    @When("user search for books")
    public void user_search_for_books() {
        System.out.println("Searched for the book");
        landingPageActions.searchProduct();
    }
}
