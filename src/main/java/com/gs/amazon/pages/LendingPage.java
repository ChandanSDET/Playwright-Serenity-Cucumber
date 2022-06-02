package com.gs.amazon.pages;


import static com.gs.amazon.driver.DriverManager.*;
import com.microsoft.playwright.Locator;

public class LendingPage {

    protected Locator searchInput = getPage().locator("#twotabsearchtextbox");
    protected Locator searchButton = getPage().locator("#nav-search-submit-button");

}
