package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.BrowserUtils;
import com.eurotech.utilities.ConfigurationReader;
import com.eurotech.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class Login_StepDefs {
    LoginPage login = new LoginPage();
    DashboardPage dashboard = new DashboardPage();

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        //  System.out.println("I've opened the browser and navigated to DevEx website");
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user enters with teacher credentials")
    public void the_user_enters_with_teacher_credentials() {
        // System.out.println("I've entered teacher credentials then clicked login button");
        login.loginAsTeacher();

    }

    @When("The user enters with student credentials")
    public void the_user_enters_with_student_credentials() {
        //  System.out.println("I've entered student credentials then clicked login button");
        login.loginAsStudent();
    }

    @When("The user enters with developer credentials")
    public void the_user_enters_with_developer_credentials() {
        //  System.out.println("I've entered developer credentials then clicked login button");
        login.loginAsDeveloper();
    }

    @When("The user enters with SDET credentials")
    public void the_user_enters_with_sdet_credentials() {
        //  System.out.println("I've entered SDET credentials then clicked login button");
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        // System.out.println("I've verified that the url changed to the dashboard");
        // Assert.assertEquals(dashboard.welcomeMessage.getText(),"Welcome Teacher");
        Assert.assertTrue(dashboard.welcomeMessage.getText().contains("Welcome"));
    }

    @When("The user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        login.loginAsTeacher(username, password);

    }

    @Then("The welcome message contains {string}")
    public void the_welcome_message_contains(String expectedUsername) {
        Assert.assertEquals(expectedUsername, dashboard.welcomeMessage.getText());

    }

    @Then("The warning message contains {string}")
    public void theWarningMessageContains(String expectedMessage) {
        BrowserUtils.waitFor(2);
        login.getDisappearingWarningMessage(expectedMessage);
        // to find disappearing warning message
//        String validationMessage= Driver.get().findElement(By.id("loginpage-input-email")).getAttribute("validationMessage");
//        System.out.println("validationMessage = " + validationMessage);
//        Assert.assertEquals(expectedMessage,validationMessage);
    }

}
