package com.gs.amazon.steps;

import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Step;

public class SearchResultSteps {

    @Then("validate title of the page contains book")
    public void validate_title_of_the_page_contains_book() {
        System.out.println("Searched result");
    }
}
