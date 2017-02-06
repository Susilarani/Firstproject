package com.Orange;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Acer on 12/01/2017.
 */



@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/Resources",
        format = {"json:target/Orangehrm_report.jason"},
tags = "@login"
)
public class Runtest {
}
