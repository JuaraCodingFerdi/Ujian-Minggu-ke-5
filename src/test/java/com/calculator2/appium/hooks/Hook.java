package com.calculator2.appium.hooks;

import java.net.MalformedURLException;

import com.calculator2.appium.drivers.DriverSingleton;
import com.calculator2.appium.drivers.utils.TargetEnvironment;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hook {
  @BeforeAll
  public static void initialize() throws MalformedURLException {
    DriverSingleton.getDriver(TargetEnvironment.GOOGLE_CALCULATOR);
  }

  @AfterAll
  public static void finalTeardown() {
    DriverSingleton.closeDriver();
  }
}
