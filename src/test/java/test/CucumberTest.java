package test;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import ru.sbtqa.tag.cucumber.TagCucumber;

/**
 * Created by Kasyanenko Konstantin
 * on 03.07.2017.
 */
@RunWith(TagCucumber.class)
@CucumberOptions(monochrome = true, format = {"pretty"},
        glue = {"ru.sbt.webdriver.stepdefs","ru.sbtqa.tag.pagefactory.stepdefs"},
        features = {"src/test/resources/features/"},
        tags = {"@test"})
public class CucumberTest {

}
