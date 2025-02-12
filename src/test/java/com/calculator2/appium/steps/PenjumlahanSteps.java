package com.calculator2.appium.steps;

import org.testng.Assert;
import com.calculator2.appium.drivers.DriverSingleton;
import com.calculator2.appium.screens.CalculatorGoogleScreen;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PenjumlahanSteps {
  private AndroidDriver driver;
  private CalculatorGoogleScreen calculatorScreen;

  @Before
  public void setup() {
    driver = DriverSingleton.getDriver();
    calculatorScreen = new CalculatorGoogleScreen(driver);
  }

  @Given("saya menekan tombol clear")
  public void clickButtonClear() {
    calculatorScreen.clickClear();
  }

  @And("saya menekan tombol nilai {string}")
  public void clickButtonNumber(String number) {
    calculatorScreen.clickNumber(number);
  }

  @And("saya menekan tombol plus")
  public void clickButtonPlus() {
    calculatorScreen.clickPlus();
  }

  @When("saya menekan tombol sama dengan")
  public void clickButtonEqual() {
    calculatorScreen.clickEqual();
  }

  @Then("saya mendapatkan hasil {string}")
  public void getResult(String expected) {
    Assert.assertEquals(calculatorScreen.getResult(), expected);
  }
}
