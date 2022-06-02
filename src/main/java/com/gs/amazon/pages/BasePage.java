package com.gs.amazon.pages;

import com.gs.amazon.driver.DriverManager;
import com.gs.amazon.fileUtils.PropertiesCache;
import com.microsoft.playwright.Page;
import net.serenitybdd.screenplay.playwright.Photographer;
import net.thucydides.core.model.TakeScreenshots;
import net.thucydides.core.model.screenshots.ScreenshotPermission;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.Configuration;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Optional;

public class BasePage {
  public static ThreadLocal<Page> page = new ThreadLocal<>();

  {
    try {
      // this.page.set(DriverManager.getInstance(PropertiesCache.getInstance().getProperty("browser")));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
