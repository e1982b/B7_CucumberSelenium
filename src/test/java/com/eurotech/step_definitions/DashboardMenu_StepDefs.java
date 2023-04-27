package com.eurotech.step_definitions;

import com.eurotech.pages.DashboardPage;
import com.eurotech.pages.LoginPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


import java.util.List;
import java.util.Map;

public class DashboardMenu_StepDefs {
    DashboardPage dashboard = new DashboardPage();
    LoginPage login = new LoginPage();

    @Then("The user should be able to see following menu")
    public void the_user_should_be_able_to_see_following_menu(List<String> expectedList) {
        System.out.println("expectedList.size() = " + expectedList.size());
        System.out.println("expectedList = " + expectedList);
        Assert.assertEquals(expectedList, BrowserUtils.getElementsText(dashboard.menuList));
    }

    @When("The user logs in using following credentials")
    public void the_user_logs_in_using_following_credentials(Map<String, String> userCredentials) {
        login.loginAsTeacher(userCredentials.get("username"), userCredentials.get("password"));
        Assert.assertEquals(userCredentials.get("message"), dashboard.welcomeMessage.getText());
    }

    @Then("The user should be able to see followings")
    public void the_user_should_be_able_to_see_followings(List<String> expectedList) {
        Assert.assertEquals(expectedList, BrowserUtils.getElementsText(dashboard.editMenu));
        System.out.println("dashboard.editMenu = " + BrowserUtils.getElementsText(dashboard.editMenu));

    }
}
