package com.calculator2.appium.screens;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.calculator2.appium.drivers.utils.TimeDuration;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorGoogleScreen {
  private final AndroidDriver driver;
  private final WebDriverWait wait;

  private final By buttonClear = AppiumBy.accessibilityId("kosongkan");
  private final By buttonPlus = AppiumBy.accessibilityId("tambah");
  private final By buttonEqual = AppiumBy.accessibilityId("sama dengan");
  private final By textEdit = AppiumBy.id("com.google.android.calculator:id/result_final");

  // Menambahkan pemetaan tombol angka
  private final By[] buttonNumbers = {
      AppiumBy.accessibilityId("0"),
      AppiumBy.accessibilityId("1"),
      AppiumBy.accessibilityId("2"),
      AppiumBy.accessibilityId("3"),
      AppiumBy.accessibilityId("4"),
      AppiumBy.accessibilityId("5"),
      AppiumBy.accessibilityId("6"),
      AppiumBy.accessibilityId("7"),
      AppiumBy.accessibilityId("8"),
      AppiumBy.accessibilityId("9"),
  };

  public CalculatorGoogleScreen(AndroidDriver driver) {
    this.driver = driver;
    this.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeDuration.FIVE));
    this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
  }

  private void clickButton(By locator) {
    try {
      WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
      element.click();
    } catch (Exception e) {
      System.out.println("Gagal mengklik tombol: " + locator.toString());
      e.printStackTrace();
    }
  }

  public void clickClear() {
    clickButton(buttonClear);
  }

  public void clickPlus() {
    clickButton(buttonPlus);
  }

  public void clickEqual() {
    clickButton(buttonEqual);
  }

  // Metode untuk menangani angka dinamis
  public void clickNumber(String number) {
    for (char digit : number.toCharArray()) {
      int index = Character.getNumericValue(digit);
      if (index >= 0 && index <= 9) {
        clickButton(buttonNumbers[index]);
      }
    }
  }

  public String getResult() {
    try {
      WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(textEdit));
      return element.getText();
    } catch (Exception e) {
      System.out.println("Gagal mengambil hasil kalkulasi.");
      e.printStackTrace();
      return "";
    }
  }
}
