package com.Orange;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by Acer on 12/01/2017.
 */
public class MyStepdefs {
    public WebDriver driver;




        @Before
        public void startbrowser(){
            System.out.println("Open");

           // System.setProperty("webdriver.firefox.driver", "C:\\Program Files\\Firefox.exe");
            WebDriver driver=new FirefoxDriver();


          // System.setProperty("webdriver.firefox.driver", "C:\\Program Files\\Firefox");


            // driver.get("http://www.bbc.co.uk/news");
           driver.get( "http://sbtechnoservice.trials54.orangehrmlive.com/");
            driver.manage().timeouts().implicitlyWait(300, TimeUnit.MINUTES);
            driver.manage().window().maximize();

        }
        @After
        public void closeandexit() {

           // System.out.println("Close");

            driver.quit();
            System.out.println("Close");


        }

    @Given("^I am on the Orangehrm login page$")
    public void i_am_on_the_Orangehrm_login_page() throws Throwable {
        System.out.println("Hai");
       // Assert.assertTrue(driver.findElement(By.id("divUsername" )).getText().contains("LOGIN Panel"));
    }

    @When("^I sign in with Username and Password$")
    public void i_sign_in_with_Username_and_Password() throws Throwable {
        System.out.println("Hello");
     //  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
      //  driver.findElement(By.id("txtPassword")).sendKeys("QzF6xwOA");
       // driver.findElement(By.id("btnLogin")).click();


    }

    @Then("^I should be logged in$")
    public void i_should_be_logged_in() throws Throwable {
        System.out.println("Welcome");
      // Assert.assertTrue(driver.findElement(By.id("welcome")).getText().contains("Welcome Admin"));


    }

}


