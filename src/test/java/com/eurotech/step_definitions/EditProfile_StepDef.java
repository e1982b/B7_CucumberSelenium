package com.eurotech.step_definitions;

import com.eurotech.pages.ProfilPage;
import com.eurotech.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class EditProfile_StepDef {
    ProfilPage profilPage = new ProfilPage();

    @Then("The user select {string} as a career")
    public void the_user_select_as_a_career(String value) {
        profilPage.selectStatus(value);

    }

    @Then("The user choose {int} years of work experience")
    public void the_user_chose_years_of_work_experience(Integer experienceYear) {
        profilPage.slider(experienceYear);
    }

    @Then("The user add {string} {string}")
    public void the_user_add(String name, String info) {
        profilPage.addInfo(name, info);
        BrowserUtils.waitFor(1);
    }
    @Then("The users profile should be saved")
    public void the_users_profil_should_be_saved() {
        profilPage.submitBtn.click();
        BrowserUtils.verifyElementDisplayed(profilPage.profileUpdatedMessage);

    }

}
