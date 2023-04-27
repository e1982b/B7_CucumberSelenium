package com.eurotech.pages;

import com.eurotech.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class ProfilPage extends BasePage {
    @FindBy(name = "githubusername")
    public WebElement githubUsername;

    @FindBy(linkText = "Go Back")
    public WebElement goBackBtn;
    @FindBy(id="editprofile-from-addsocial-btn")
    public WebElement submitBtn;
    @FindBy(id = "editprofile-from-status-select")
    public WebElement selectBox;

    @FindBy(id = "slider-input")
    public WebElement sliderExperience;
    @FindBy(xpath = "//*[.='Profile Updated']")
    public WebElement profileUpdatedMessage;

    public void selectStatus(String value) {
        ProfilPage profilPage = new ProfilPage();
        Select select = new Select(profilPage.selectBox);
        select.selectByValue(value);
    }

    public void slider(int experienceYear) {
        for (int i = 0; i <= 10; i++) {
            sliderExperience.sendKeys(Keys.ARROW_LEFT);
        }
        for (int i = 0; i < experienceYear; i++) {
            sliderExperience.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    public void addInfo(String name, String info) {
        WebElement placeHolder = Driver.get().findElement(By.name(name));
        placeHolder.clear();
        placeHolder.sendKeys(info);
    }

}
