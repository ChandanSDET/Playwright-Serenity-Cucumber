package com.gs.amazon.driver;

import com.microsoft.playwright.*;

import java.sql.SQLOutput;
import java.util.Objects;

public class DriverManager<playwright> {

  static ThreadLocal<Page> page = new ThreadLocal<>();
  static ThreadLocal<Playwright> playwright = new ThreadLocal<>();
  static ThreadLocal<BrowserType.LaunchOptions> launchOptions = new ThreadLocal<>();
  static BrowserContext context;
  static ThreadLocal<Browser> browser = new ThreadLocal<>();

  private DriverManager() {
  }

  public static void getInstance() {
    if (Objects.isNull(browser.get())) {
      playwright.set(Playwright.create());
      launchOptions.set(new BrowserType.LaunchOptions());
      launchOptions.get().setHeadless(false);
      launchOptions.get().setChannel("chrome");
      browser.set(playwright.get().chromium().launch(launchOptions.get()));
    }
  }


  public static Page getPage() {
    getInstance();
    if (page.get() == null)
      page.set(browser.get().newPage());
    return page.get();
  }

  public static void tearDown() {
    if (page.get() != null) {
      page.get().close();
      page.remove();
    }
  }

}
