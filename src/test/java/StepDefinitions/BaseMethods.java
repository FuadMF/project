package StepDefinitions;

import DriverSession.CucumberHooks;
import org.openqa.selenium.WebDriver;

public class BaseMethods {

    public WebDriver driver = CucumberHooks.driver.get();
}
