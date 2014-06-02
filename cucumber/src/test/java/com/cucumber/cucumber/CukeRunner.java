package com.cucumber.cucumber;

import org.junit.runner.*;

import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@Cucumber.Options
(
		format={"pretty", "html:target/cucumber"},
		features="src/test/resources"
		
		)
public class CukeRunner {

}
