package com.gs.amazon.actions;

import static com.gs.amazon.driver.DriverManager.getPage;

import com.gs.amazon.pages.LendingPage;
import net.serenitybdd.screenplay.playwright.Photographer;
import net.serenitybdd.screenplay.playwright.abilities.BrowseTheWebWithPlaywright;

public class LandingPageActions extends LendingPage {

  public void searchProduct() {
    getPage().navigate("http://www.amazon.in");
    searchInput.fill("book");
    searchButton.click();

  }
}
