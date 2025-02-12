package com.calculator2.appium.drivers.utils;

public class TargetEnvironment {
  public static final String CALCULATOR = "calculator";
  public static final String GOOGLE_CALCULATOR = "google-calculator";
  public static final String ECOMMERCE = "ecommerce";

  // prevent instance
  private TargetEnvironment() {
    throw new UnsupportedOperationException("Class ini hanya boleh mengakses konstanta");
  }
}
