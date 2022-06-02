package com.gs.amazon.steps;

import com.gs.amazon.driver.DriverManager;
import com.gs.amazon.pages.BasePage;
import io.cucumber.java.After;

public class Hooks  {

    @After
    public void  tearDown(){
         DriverManager.tearDown();
    }
}
