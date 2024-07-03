package StepDefinitions;

import Pom.LoginPom;
import io.cucumber.java.en.Given;

public class LoginSteps extends BaseMethods {

    LoginPom loginPom;


    public LoginSteps(){
        loginPom = LoginPom.getInstance();
    }

    @Given("User is in {string} page")
    public void userWantTo(String arg0)  {
    }

}
