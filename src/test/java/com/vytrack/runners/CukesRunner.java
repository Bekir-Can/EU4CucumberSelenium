package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//This class creates to connection between login.future and LoginStepDefs we use for this: feature and glue =>look below****

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"json:target/cucumber.json",// the cucumber.json file coming out with this code
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},//to get(adding) basic html reports(inside the curly braces)
        features = "src/test/resources/features", // we dont have to change the path every time
        glue = "com/vytrack/step_definitions",  // we dont have to change the path every time
        dryRun = false,

        //dryRun=true,
        //tags="@store_manager"//we specified the scenario with tags ana we wrote the Note above the scenario,
        // which is in the login.feature
        //tags="@driver"
        //tags = "@login"//whenever to find the @login and how much it execute that scenario

        //tags="@driver and @VYT-123" =>New syntax
        //tags = "@driver or @VYT-123" //old syntax

        tags = "@wip"



)

public class CukesRunner {
}
