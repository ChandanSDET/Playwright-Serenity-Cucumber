package com.gs.amazon.fileUtils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.Set;

public class PropertiesCache {
  private final Properties configProp = new Properties();

  private PropertiesCache() throws IOException {
    System.out.println(System.getProperty("user.dir") + "/serenity.properties");
    InputStream iStream = this.getClass().getClassLoader().getResourceAsStream("serenity.properties");
    System.out.println(iStream);
    System.out.println("Reading all properties from the file");
    if (iStream == null) {
      throw new IOException("File not found");
    }
    try {
      configProp.load(iStream);
    } catch (IOException e) {
      System.out.println("---->" + e);
      e.printStackTrace();
    }
  }

  //Bill Pugh Solution for singleton pattern
    /*private static class LazyHolder {
        private static final PropertiesCache INSTANCE = new PropertiesCache();
    }*/

  public static PropertiesCache getInstance() throws IOException {
    return new PropertiesCache();
  }

  public String getProperty(String key) {
    return configProp.getProperty(key);
  }

}