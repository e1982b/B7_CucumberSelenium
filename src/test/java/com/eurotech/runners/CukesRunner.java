package com.eurotech.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports.html",
                "rerun:target/rerun.txt"
        },
        features = "src/test/resources/features",
        glue = "com/eurotech/step_definitions",
        dryRun = false, // true olunca sadece tanimsiz teslerin sonuclarini gösterir
        tags = "@ep" // "@developer or @teacher" ## "@sdet and @wip" ## "@login and not @wip" ## @Login ## @wip ## @login and @sdet

)
public class CukesRunner {

}
